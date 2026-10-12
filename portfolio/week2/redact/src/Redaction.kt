// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(text: String, toRedact: String, redaction: Char = 'X'): String {
    //if redaction is empty then nothing can be done
    if (toRedact == "") {
        return text
    }
    if (toRedact in text) {
        //found .repeat and .replace functions online
        //needs to create replacemet string of same length as redaction adn then use replacement function
        var replacement = redaction.toString()
        replacement = replacement.repeat(toRedact.length)
        return text.replace(toRedact, replacement)
    }
    //return otherwise
    return text
}