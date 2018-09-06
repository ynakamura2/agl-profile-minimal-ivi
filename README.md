# agl-profile-minimal-ivi
agl profile for minimal ivi system

Usual agl-demo distribution contains quite a few packages because 
it suports many functionalities. It requires much storage and CPU power.
However when we think about reasonalbe IVI system, it only has necessary applications.
agl-profile-minimal-ivi introduces minimal packages for IVI system.

Precondition:
you need to prepare repo environment.

1. repo init -b master -m flounder_5.99.4.xml -u https://gerrit.automotivelinux.org/gerrit/AGL/AGL-repo
2. repo sync
3. copy agl-profile-minimal-ivi.bb and agl-profile-minimal-ivi.inc under /meta-agl-demo/recipes-platform/images
4. copy packagegroup-agal-profile-minimal-ivi.bb and packagegroup-agl-minimal-ivi.bb under meta-agl-demo/recipes-platform/packagegroups/
5. source meta-agl/scripts/aglsetup.sh -m raspberrypi3 agl-demo agl-netboot agl-appfw-smack
6. bitbake agl-profile-minimal-ivi

you will see the home screen with setting, phone and mixer.
Necessary packages are removed accordingly.
