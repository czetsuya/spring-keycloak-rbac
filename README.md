[![patreon](https://c5.patreon.com/external/logo/become_a_patron_button.png)](https://www.patreon.com/bePatron?u=12280211)
[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)

**Help me keep this project updated by supporting me on Patreon.*

# Spring Boot with Keycloak Role Based Access Control

This demo project is composed of a Spring Boot REST API project that serves a menu list of a given user's role.

## Requirements:

- Spring Boot 2.x
- Keycloak server 8.0.1

*Starting with Keycloak version 7.0.0, the Keycloak team has introduced the notion of feature and uploading the json file has become one of them. 
Sadly, it is disabled by default. To enable realm, upload run Keycloak with the given parameter:

```
standalone.bat -Djboss.socket.binding.port-offset=1 -Dkeycloak.profile.feature.upload_scripts=enabled
```

Here's the documentation: https://www.keycloak.org/docs/latest/server_installation/, look at the profiles section.

## Note:

If keycloak.json file is to be used instead of application.yml, set the following system variable and make sure that you have the file keycloak.json in src/main/resources.

keycloak.configurationFile = classpath:keycloak.json

## Users

Role=PROMOTER, sarah / kerrigan

Role=SUPERVISOR, jim / raynor

## Authors

 * **Edward P. Legaspi** - *Java Architect* - [czetsuya](https://github.com/czetsuya)
