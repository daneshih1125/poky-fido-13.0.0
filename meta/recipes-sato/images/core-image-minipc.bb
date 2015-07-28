DESCRIPTION = "Image with Sato, a mobile environment and visual style for \
mobile devices. The image supports X11 with a Sato theme, Pimlico \
applications, and contains terminal, editor, and file manager."

IMAGE_FEATURES += "splash package-management x11-base x11-sato ssh-server-dropbear hwcodecs"

LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += "x264"
IMAGE_INSTALL += "libav"
IMAGE_INSTALL += "packagegroup-core-x11-sato-games"
IMAGE_INSTALL += "gstreamer1.0-libav"
IMAGE_INSTALL += "gstreamer-vaapi-1.0"
IMAGE_INSTALL += "libva-intel-driver"
