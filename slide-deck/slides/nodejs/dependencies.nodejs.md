## Dependencies

```
  "dependencies": {
    "@angular/common": "2.1.0",
    ...
  },
  "devDependencies": {
    "karma": "1.2.0",
    ...
  }
```

note:
- Two "sections" of deps here
- "Dependencies" is what's needed for other code to run your exported package
- "Dev Dependencies" is for tools needed to work on the code
- can use npm install X  

- Please install things by adding them here: use exact versions! (or pass `-D -E`)

- Some may argue for using bower for front-end deps like angular, react etc
- Our opinion is one that if npm has all those tools, why install two package managers?