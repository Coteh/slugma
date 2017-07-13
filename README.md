# slugma

A simple Clojure module that will take a string of text and slugify it into a string appropriate to place as part of a URL for a webpage.

This module is a pretty basic implementation. It replaces all non-ASCII character sequences with dashes, as well as breaks up any accented characters.
(into regular character plus diacritic, and removes the diacritic)
This is my first venture into functional programming and this was made mainly as a fun way
to get the hang of Clojure and its syntax.

## Installation

FIXME: Add instructions for installing this module

## Usage (cli)

    $ java -jar slugma-0.1.0-standalone.jar [args ...]

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
