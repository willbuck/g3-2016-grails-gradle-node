# Package.json
A.K.A. Node's `build.gradle`

```
{
    "name": "my-angular2-project",
    "version": "1.0.0",
    "license": "MIT",
    "private": true,
    "scripts": {
        "start": "ng serve",
        ...
    },
    "dependencies": {
        "@angular/common": "~2.1.0",
        ...
    },
    "devDependencies": {
        "karma": "1.2.0",
        ...
    }
}
```

note:
- The heart of every node project
- Lots going on in here, let's break each portion into chunks and talk about what they do