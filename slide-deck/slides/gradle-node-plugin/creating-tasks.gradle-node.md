## Making your own tasks

```
task integrationTest(type: NpmTask, dependsOn: 'npmInstall') {
    args = ['run', 'e2e']
}
```