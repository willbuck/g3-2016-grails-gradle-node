###  build.gradle

```

node {
    version = '6.9.1'
    download = true
}

task bundle {
    dependsOn(['npmInstall', 'npm_run_bundle'])
}

task webpack {
    dependsOn(['npmInstall', 'npm_run_webpack'])
}

bootRun.dependsOn(['bundle'])
assetCompile.dependsOn(['bundle'])

```
note:
    Highlight bundle/webpack tasks
