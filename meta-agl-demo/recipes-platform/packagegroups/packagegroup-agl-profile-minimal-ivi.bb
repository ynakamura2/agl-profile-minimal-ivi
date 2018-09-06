SUMMARY = "The software for DEMO platform of AGL Minimal IVI profile"
DESCRIPTION = "A set of packages belong to AGL Minimal IVI Profile"

LICENSE = "MIT"

inherit packagegroup

PACKAGES = "\
    packagegroup-agl-profile-minimal-ivi \
    "

ALLOW_EMPTY_${PN} = "1"

RDEPENDS_${PN} += "\
    packagegroup-agl-image-ivi \
    "

RDEPENDS_${PN} += "\
    packagegroup-agl-profile-graphical-qt5 \
    packagegroup-agl-minimal-ivi \
    "


AGL_APPS = " \
    virtual/mixer  \
    phone \
    settings \
    " 

QTAGLEXTRAS = "${@bb.utils.contains("DISTRO_FEATURES", "agl-hmi-framework", " qtaglextras", "",d)}"

RDEPENDS_${PN}_append = " \
    qtquickcontrols2-agl \
    qtquickcontrols2-agl-style \
    linux-firmware-ralink \
    ${QTAGLEXTRAS} \
    ${AGL_APPS} \
    "
