## Deploying Angular 2 + Grails Apps

- `ng build --prod`, ship dist folder

note:
- Recommending separting them
- To ship together, you'll want to roll similar to angular 1 or react 1 profile
- That would use 
    - src/ folder to "separate" the apps, 
    - ng cli to build & copy (instead of webpack direct like react 1),
    - asset-pipeline to serve from war