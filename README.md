Surefire and JUnit Categories
=============================

In following setup, we want to run:

* unit tests in `test` phase
* smoke tests in `verify` phase

Advanced profiles
-----------------

We have also setup few profiles:

* `integration-tests` run all integration tests including smoke tests

    mvn verify -Pintegration-tests


* `browser-firefox` will exclude tests which are not support on Firefox

   mvn verify -Pintegration-tests -Pbrowser-firefox
