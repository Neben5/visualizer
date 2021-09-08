# This is a test

The purpose of this project is to parse a binary file(s) given by a user and visualize them in 3-space

## Components

1. Input Structure

    At the beginning of this project, inputs will be static, then text, then binary.
    This is simply for ease of development

2. Tokenizer

    The parser will likely be the thing to change the most throughout this project.
It will first turn text into tokens, then binary.

3. Lexer

    The lexer will help specify objects, vertices, and faces from the tokenized inputs.

4. Parser

    The parser will be finalized early on into the project. It will build simulated objects in the memory heirarchy.

5. Actor System

    The actor system will hold all objects and their heirarchy, as well as organize how runtime is distributed.

6. Visualizer

    The vizualizer system will be by far the most complex component. It will draw objects from the perspective of a plane observer. It will manage covering objects, as well as all the lensing effects.

    In the future, the vizualizer component may also handle user input to move perspectives.
