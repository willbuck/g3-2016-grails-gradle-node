###  webpack.config.js

```
module.exports = {
    entry: { index: './src/main/webapp/app.js' },
    output: {
        path: './grails-app/assets/javascripts',
        publicPath: '/assets/',
        filename: 'bundle.js'
    },
    module: {
        loaders: [ {
            test: /\.js$/,
            include: path.join(__dirname, 'src/main/webapp'),
            loader: 'babel',
            query: { presets: ['es2015', 'react'] }
        }]
    }
};
```
note:
    Highlight - webpack/bundle scripts
