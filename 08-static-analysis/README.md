# The `VSSL` language

## Data types

The data types used are `BOOLEAN` and `INTEGER`.
For this assignment expressions can be `BOOLEAN` or `INTEGER`
but variables will only be defined for `INTEGER` types.

```
DEF <variable name> : INTEGER
```

## Expressions

Expressions in this assignment are limited to expressions with one operator.
Operators are:

| Syntax                   | Meaning               | Return type |
| :----------------------: | :-------------------- | :---------- |
| `<INTEGER>`              | Constant integer      | INTEGER     |
| `<INTEGER> + <INTEGER>`  | Plus                  | INTEGER     |
| `<INTEGER> - <INTEGER>`  | Minus                 | INTEGER     |
| `-<INTEGER>`             | Unary minus           | INTEGER     |
| `<INTEGER> < <INTEGER>`  | Less than             | BOOLEAN     |
| `<INTEGER> <= <Integer>` | Less than or equal    | BOOLEAN     |
| `<INTEGER> == <Integer>` | Equal                 | BOOLEAN     |
| `<INTEGER> >= <Integer>` | Greater than or equal | BOOLEAN     |
| `<INTEGER> > <Integer>`  | Greater than          | BOOLEAN     |

Operators `AND`, `OR`, and `NOT` together with
boolean constants `TRUE` and `FALSE` also exist in the language,
but are not used in this assignment.

## Statements

Statements in this assignment are limited to:

| Syntax                                              | Meaning                    |
| :-------------------------------------------------- | :------------------------- |
| `DEF <variable name> : INTEGER`                     | Define variable            |
| `LET <variable name> = <interger expression>`       | Instantiate variable       |
| `{ <statements> }`                                  | Block of statements        |
| `IF <boolean expression> THEN <block>`              | Selection                  |
| `IF <boolean expression> THEN <block> ELSE <block>` | Selection with alternative |

Statements for defining functions and
loops (`WHILE <boolean expression> DO <block>`) also exist,
but are not used in this assignment.

# Assignment

* Create an abstract syntax tree for the following `VSSL`-code:

```
DEF X: Integer
IF (Y < 10) {
    LET X = 100
    }
LET Y = Y + 10
IF (Y >= 20) {
    LET X = 4711
    }
```

* Create classes to support variable value ranges and computer states
* Implement methods to make static analysis
