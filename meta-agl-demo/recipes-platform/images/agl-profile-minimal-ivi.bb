#DESCRIPTION = "AGL minimal Demo Platform image currently contains a simple HMI and \
#demos."

require agl-profile-minimal-ivi.inc

LICENSE = "MIT"

IMAGE_FEATURES_append = " \
    "

# add packages for demo platform (include demo apps) here
IMAGE_INSTALL_append = " \
    packagegroup-agl-profile-minimal-ivi \
    "

