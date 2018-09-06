SUMMARY = "The software for AGL IVI DEMO profile"
DESCRIPTION = "A set of packages belong to AGL Demo"

LICENSE = "MIT"

inherit packagegroup

PACKAGES = "\
    packagegroup-agl-minimal-ivi \
    "

ALLOW_EMPTY_${PN} = "1"

SMARTDEVICELINK = "${@bb.utils.contains('DISTRO_FEATURES', 'agl-sdl', \
    'packagegroup-agl-smartdevicelink', '', d)}"

# old homescreen package
HOMESCREEN-OLD = "homescreen"
# packages from hmi-framework aka homescreen-2017
HOMESCREEN-NEW = "packagegroup-hmi-framework packagegroup-hmi-framework-dev"

# old audio package
AUDIO-OLD = "audiomanager"
# packages from new 4A framework
AUDIO-NEW = "packagegroup-agl-audio"

RDEPENDS_${PN} += "\
    libqtappfw \
    ${@bb.utils.contains('DISTRO_FEATURES', 'agl-hmi-framework', '${HOMESCREEN-NEW}', '${HOMESCREEN-OLD}', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'agl-audio-4a-framework', '${AUDIO-NEW}', '${AUDIO-OLD}', d)} \
    udisks \
    ${SMARTDEVICELINK} \
    "

# add support for websocket in Qt and QML
EXTRA_APPS_append = " qtwebsockets qtwebsockets-qmlplugins"
PREFERRED_PROVIDER_virtual/webruntime = "web-runtime"


RDEPENDS_${PN} += " \
    linux-firmware-ath9k \
    python-curses \
    dhcp-client \
    ${@bb.utils.contains('DISTRO_FEATURES', 'webruntime', 'virtual/webruntime', '', d)} \
    "


