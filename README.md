# Test assignment

We are looking for Automation Engineers that have the mindset "only the sky is the limit" and "automation doesn't stop at testing, it's just a beginning!" ;)

The purpose of this test assignment is to assess the applicant's automation skills, allowing him/her to show the best they can do and how fast they can learn.
It is an open assignment. There is no the right answer and there is no end goal other than proving yourself. Surprise us!

Make sure that you give detailed comments or descriptions of your tests.
When the assignment is complete, please push your solution to Github(Gitlab) and send us the link to hr.grid.adi@nl.abnamro.com, dana.finies@nl.abnamro.com, guido.vermeulen@nl.abnamro.com
If you have any questions, please contact Emilie Kuntze at <emilie.kuntze@nl.abnamro.com>.

Good luck.

PS. We don't expect you to spend weeks (and sleepless nights) on doing it. Lets see how far you can get in 6-10 hours. We want to see how you approach and solve problems.

PSPS. Please use mobile native tools. (Tests written on Java are accepted too)


# SETUP GIT REPO INSTRUCTIONS
- Download most recent version of android studio for your OS (when installing make sure the sdk tools and avd managers are co installed)
- in android studio go to the menu bar and click the following: file => New => Project from Version Control
- a new modal opens, input the following in the url field
    - url ssh protocol: git@github.com:Ashley-work/ABN-AMRO-testers-assesment.git
    - url https protocol: https://github.com/Ashley-work/ABN-AMRO-testers-assesment.git
- click clone button modal
- run gradle (build) scripts

# SETUP AVD (ANDROID VIRTUAL DEVICE)
- in android studio go to the menu bar and click the following: Tools => AVD Manager
    - a new modal opens
        - click the "create virtual device" on the bottom
            - go through the wizard: choose a phone device "pixel 3a" and choose (download first when this option is visible) api 30 (android 11).
- make sure the created device is selected in the dropdown right under the menu in the middle of the screen


# TEST DESIGN EXPLANATION
The aim of the test design was creating a seperate suite for each page component (homePage, the main content, homeMenu, the menu).
The test suites were created with simplicity in mind: the only thing it knows is what tests to execute.
The how is achieved by the instantiated page component, e.g. HomePage.

The page components contain action methods which are specifically tailored for that particular component.
In essence, all the page component needs, are the viewInteractions (selectors). When these are known, actions specific
for that page component can be taken.

These actions are partly generic actions enriched by specific page component inputs (e.g. the viewAction for that page component).
Thats why a generic class BaseActions is created which will contain actions for all the pageComponents

By dividing the project with this code, a seperation of concerns is achieved, meaning in practice less code duplication and easier maintainability,
as when something changes (for example text in textview) you will only need to make a change in 1 place.

# BIG TODO
- pipeline integration: add config for azure yml
- investigate Warning:(4, 36) WRITE_EXTERNAL_STORAGE no longer provides write access when targeting Android 10, unless you use `requestLegacyExternalStorage`

