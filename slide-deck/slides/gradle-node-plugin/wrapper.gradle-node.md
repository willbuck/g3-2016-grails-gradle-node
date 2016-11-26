## You can even make 'npmw'!

Sample `npmw.sh`
```
#!/usr/bin/env bash

echo "Running Project Level npm"
node_modules/.bin/npm "$@"
```

[Credit: OPI Blog Post - Using Self-Contained Node/Npm with Gradle](https://objectpartners.com/2016/04/14/using-self-contained-node-js-and-npm-instances-with-gradle/)

note:
- Sometimes you want to pass options to npm scripts, but don't want to create a gradle task for it
- Having a node-js install helps in these cases
- Benefit of this: locks down node version for all devs!