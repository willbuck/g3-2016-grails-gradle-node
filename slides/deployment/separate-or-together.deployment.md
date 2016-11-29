## Deploy Separately or Together

- Separate: Any front-end asset hosting
- Together: Bundle the front-end & serve as you normally would

note:
- Separate could use S3 bucket, github pages, surge.sh, 
- or self-managed static assets host (httpd, nginx)
- Together, works like a gsp-app would expect (grails-wise)
- Can build a bundle file (or files), stick in grails-app/assets, and business as usual
- We'd recommend separated for the flexibility of it, but to each their own
