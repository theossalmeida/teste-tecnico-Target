
function countLetterA(str) {
    const regex = /a/gi;
    const matches = str.match(regex);
    const count = matches ? matches.length : 0;

    console.log(`String "${str}" ${count > 0 ? 'contain' : "doesn't contain"} a letra 'a'.`);
    if (count > 0) {
        console.log(`Letter 'a' aparece ${count} tim${count > 1 ? 'es' : 'e'}.`);
    }
}

const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

function getInputFromCommandLine() {
    readline.question("Write a string to verify existence of letter 'a': ", (userString) => {
        countLetterA(userString);
        readline.close();
    });
}

getInputFromCommandLine();