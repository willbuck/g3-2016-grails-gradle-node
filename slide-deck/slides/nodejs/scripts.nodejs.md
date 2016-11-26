## Scripts
A.K.A. tasks

```
  "scripts": {
    "start": "ng serve",
    "lint": "tslint \"src/**/*.ts\"",
    "test": "ng test --watch=false",
    "pree2e": "webdriver-manager update",
    "e2e": "protractor"
  },
```

To execute: `npm run lint`

`npm start` is a special case 

note:
- Some may argue for using a task runner like grunt or gulp
- Can be useful for complex tasks but npm scripts are universal and require nothing extra
- Most tools can be configured via single command to run the desired task
- Webpack does a lot of what those tools are used for doing 
- TRANSITION: Introduce the gradle piece of all this 