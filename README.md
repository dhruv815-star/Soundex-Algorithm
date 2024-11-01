# Soundex Algorithm Implementation in Java

A simple, standalone implementation of the **Soundex Algorithm** in Java. Soundex is a phonetic algorithm that encodes words into a 4-character code based on their pronunciation, allowing for comparison of words with similar sounds.

## Table of Contents

- [Overview](#overview)
- [How Soundex Works](#how-soundex-works)
- [Installation](#installation)
- [Usage](#usage)
- [Examples](#examples)
- [Contributing](#contributing)
- [License](#license)

## Overview

The Soundex algorithm is a phonetic algorithm that converts a name into a code based on how it sounds, rather than how it's spelled. The algorithm's goal is to encode homophones, or words that sound the same, to the same representation so that they can be matched

## How Soundex Works

1. The first letter of the word is retained as the first character of the Soundex code.
2. Subsequent letters are encoded based on Soundex rules:
   - `B, F, P, V` → `1`
   - `C, G, J, K, Q, S, X, Z` → `2`
   - `D, T` → `3`
   - `L` → `4`
   - `M, N` → `5`
   - `R` → `6`
3. Remove vowels (`A, E, I, O, U`), `H`, `W`, and `Y`, except as the first character.
4. Duplicate digits are combined into one.
5. The resulting code is truncated or padded to ensure a 4-character code.

For example, the name "Robert" is encoded as `R163`.

## Installation

1. Clone this repository:

   ```bash
   git clone https://github.com/dhruv815-star/Soundex-Algorithm.git
   
## Usage

This program takes a single word as input from the user and returns its Soundex code.

### Running the Program

To run the program, use the following command:

```bash
java SoundexAlgo.java  
```

## Examples of Soundex Algorithm

Here are a few examples of words and their Soundex codes:

### Examples

| Word       | Soundex Code |
|------------|--------------|
| Robert     | R163         |
| Rupert     | R163         |
| Rubin      | R150         |
| Jackson    | J250         |
| Johansson  | J525         |

## Contributing
Contributions are welcome! If you have a suggestion or find an issue, please submit a pull request or open an issue. Here’s how to contribute:

1) Fork the repository.
2) Create a new branch (git checkout -b feature/YourFeature).
3) Commit your changes (git commit -m 'Add a new feature').
4) Push to the branch (git push origin feature/YourFeature).
5) Open a Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.