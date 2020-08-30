## 💠 Drawio Over Heroku

![ver](https://img.shields.io/badge/version-1.0.0-blue.svg)
![drawio](https://img.shields.io/badge/drawio-13.6.4-green.svg)
[![Heroku App Status](http://heroku-shields.herokuapp.com/drawio-der3318)](https://drawio-der3318.herokuapp.com)
![browsers](https://img.shields.io/badge/browsers-chrome%20edge%20firefox-yellow.svg)
![license](https://img.shields.io/badge/license-diagrams.net%20Apache-blueviolet.svg)

This is a [Jooby](https://github.com/jooby-project/jooby) wrapped [Heroku](https://dashboard.heroku.com/apps) application hosting drawio website, which is an open source diagramming tool.

![Imgur](https://i.imgur.com/4dgsuZD.png)

 
### 📝 Deployment Steps

Create an account and start a new application with any prefered name from https://dashboard.heroku.com/apps after cloning the repo:

| ![Imgur](https://i.imgur.com/WEbkGLW.png) |
| :-: |
| ![Imgur](https://i.imgur.com/tO8IpDW.png) |

Navigate to Settings to setup the config vars and buildpack named <kbd>heroku/gradle</kbd>:

| Key | Value |
| :- | :- |
| GRADLE_TASK | shadowJar |

![Imgur](https://i.imgur.com/xepCwt2.png)

Navigate to Deploy and choose Github to link your account and select target branch to deploy:
| ![Imgur](https://i.imgur.com/0Icvlcl.png) |
| :-: |
| ![Imgur](https://i.imgur.com/xg9MQ36.png) |
| ![Imgur](https://i.imgur.com/u0QHB77.png) |

Check your app via <kbd>https://[app-name].herokuapp.com/</kbd>.

![Imgur](https://i.imgur.com/stiOD9y.png)


