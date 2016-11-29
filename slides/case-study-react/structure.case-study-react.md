##  React/Webpack Profile for Grails 3

![Profile structure](img/webpack-profile.png)
note:
    Notice that the React code really is it's own app - assuming that all the communication is via REST calls (i.e., you're not using server-side rendering with Nashorn), you can actually quite easily move the React app out of the Grails project by simply moving the source to it's own project, and configuring webpack to render the bundle to the browser instead of Grails AP.
