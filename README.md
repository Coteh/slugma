# slugma [![Build Status](https://travis-ci.org/Coteh/slugma.svg?branch=master)](https://travis-ci.org/Coteh/slugma)

A simple Clojure module that will take a string of text and slugify it into a string appropriate to place as part of a URL for a webpage.

It replaces all spaces with dashes, breaks up any accented characters, removes common words such as conjunctions, and
keeps words connected by symbols and punctuation such as commas and apostrophes together.

This is my first venture into functional programming and this was made mainly as a fun way
to get the hang of Clojure and its syntax.

## Installation

To compile the program with Leiningen, either run `lein jar` to generate a jar with just the project class files and no dependencies,
or run `lein uberjar` to generate a standalone jar with both project class files and all dependencies needed.

## Usage (cli)

If you built the project already, you can run it like this:

    $ java -jar slugma.jar [args ...]

Or, if you have Leiningen installed, just do:

    $ lein run [args ...]

`args ...` is a variable number of strings. Each will be processed by the slugma function
one at a time then printed out to screen.

## Examples

    $ lein run "Hey there!"
    -> hey-there

### Bugs

None yet.

## License

Copyright © 2017 James Cote

Distributed under the Eclipse Public License version 1.0.
