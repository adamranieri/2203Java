
// JS docs allow you to comment your code
// can create type parameters and returns which can be read by the intellisense
// does not enforce anything

/** @param {string} phrase  @param {number} times @returns {string} */
function multiString(phrase, times){
    return phrase.repeat(times)
}

console.log(multiString("Cool",5))