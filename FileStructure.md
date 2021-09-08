# Object File Structure

## How are objects described?

Objects have faces. Faces are flat planes defined by straight line edges. 
These edges are defined by two points.

## What format are we using to define vertices and their connections?

We will be starting with JSON. All vertices will be held in an array.
Every vertex will hold its own position.
All lines will be held in an array. Every line will hold two vertices.
All faces will be held in an array. Every face will hold its lines.