# the-internet.herokuapp 


##### Automated Acceptance Tests written with Java and Selenium for http://the-internet.herokuapp.com 
This repository contains automated tests written in Java using the Selenium framework for the web application located at [http://the-internet.herokuapp.com/](http://the-internet.herokuapp.com/).

---
## Jenkins Pipeline Integration

This project includes a Jenkinsfile for setting up a fully automated CI/CD pipeline in Jenkins. The pipeline builds, tests, and deploys the application automatically. Pushed changes trigger test runs, and successful builds can be deployed to staging/production.

Follow these steps to set up the Jenkins Pipeline:

1. Install Jenkins and necessary plugins (Maven, Git).
2. Create a Jenkins pipeline job.
3. Configure the repository as the project source.
4. Add the Jenkinsfile to the pipeline configuration.
5. Save and run the pipeline.

Now, whenever you push new changes to this repository, Jenkins will automatically trigger the pipeline, and your automated tests will run against the [http://the-internet.herokuapp.com](http://the-internet.herokuapp.com) web application. Any successful build can also be automatically deployed if you've configured deployment stages in the Jenkinsfile.

---

- [A/B Testing](https://the-internet.herokuapp.com/abtest)
- [Add/Remove Elements](https://the-internet.herokuapp.com/add_remove_elements/)
- [Basic Auth](https://the-internet.herokuapp.com/basic_auth)(user and pass: admin)
- [Broken Images](https://the-internet.herokuapp.com/broken_images)
- [Checkboxes](https://the-internet.herokuapp.com/checkboxes)
- [Context Menu](https://the-internet.herokuapp.com/context_menu)
- [Digest Authentication](https://the-internet.herokuapp.com/digest_auth)(user and pass: admin)
- [Disappearing Elements](https://the-internet.herokuapp.com/disappearing_elements)
- [Drag and Drop](https://the-internet.herokuapp.com/drag_and_drop)
- [Dropdown](https://the-internet.herokuapp.com/dropdown)
- [Dynamic Content](https://the-internet.herokuapp.com/dynamic_content)
- [Dynamic Controls](https://the-internet.herokuapp.com/dynamic_controls)
- [Dynamic Loading](https://the-internet.herokuapp.com/dynamic_loading)
- [Entry Ad](https://the-internet.herokuapp.com/entry_ad)
- [Exit Intent](https://the-internet.herokuapp.com/exit_intent)
- [File Download](https://the-internet.herokuapp.com/download)
- [File Upload](https://the-internet.herokuapp.com/upload)
- [Floating Menu](https://the-internet.herokuapp.com/floating_menu)
- [Forgot Password](https://the-internet.herokuapp.com/forgot_password)
- [Form Authentication](https://the-internet.herokuapp.com/login)
- [Frames](https://the-internet.herokuapp.com/frames)
- [Geolocation](http://the-internet.herokuapp.com/geolocation)
- [Horizontal Slider](http://the-internet.herokuapp.com/horizontal_slider)
- [Hovers](https://the-internet.herokuapp.com/hovers)
- [Infinite Scroll](http://the-internet.herokuapp.com/infinite_scroll)
- [Inputs](https://the-internet.herokuapp.com/inputs)
- [JQuery UI Menus](http://the-internet.herokuapp.com/jqueryui/menu)
- [JavaScript Alerts](http://the-internet.herokuapp.com/javascript_alerts)
- [JavaScript onload event error](http://the-internet.herokuapp.com/javascript_error)
- [Key Presses](http://the-internet.herokuapp.com/key_presses)
- [Large & Deep DOM](http://the-internet.herokuapp.com/large)
- [Multiple Windows](http://the-internet.herokuapp.com/windows)
- [Nested Frames](http://the-internet.herokuapp.com/nested_frames)
- [Notification Messages](http://the-internet.herokuapp.com/notification_message_rendered)
- [Redirect Link](http://the-internet.herokuapp.com/redirector)
- [Secure File Download](http://the-internet.herokuapp.com/download_secure)
- [Shadow DOM](http://the-internet.herokuapp.com/shadowdom)
- [Shifting Content](http://the-internet.herokuapp.com/shifting_content)
- [Slow Resources](http://the-internet.herokuapp.com/slow)
- [Sortable Data Tables](http://the-internet.herokuapp.com/tables)
- [Status Codes](https://the-internet.herokuapp.com/status_codes)
- [Typos](http://the-internet.herokuapp.com/typos)
- [WYSIWYG Editor](http://the-internet.herokuapp.com/tinymce)