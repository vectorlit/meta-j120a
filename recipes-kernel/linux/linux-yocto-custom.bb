# This file was derived from the linux-yocto-custom.bb recipe in
# oe-core.
#
# linux-yocto-custom.bb:
#
#   A yocto-bsp-generated kernel recipe that uses the linux-yocto and
#   oe-core kernel classes to apply a subset of yocto kernel
#   management to git managed kernel repositories.
#
# Warning:
#
#   Building this kernel without providing a defconfig or BSP
#   configuration will result in build or boot errors. This is not a
#   bug.
#
# Notes:
#
#   patches: patches can be merged into to the source git tree itself,
#            added via the SRC_URI, or controlled via a BSP
#            configuration.
#
#   example configuration addition:
#            SRC_URI += "file://smp.cfg"
#   example patch addition:
#            SRC_URI += "file://0001-linux-version-tweak.patch
#   example feature addition:
#            SRC_URI += "file://feature.scc"
#

inherit kernel
require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://github.com/LONELY-WOLF/kernel-j120f.git;protocol=git;bareclone=1;branch=${KBRANCH}"

SRC_URI += "file://defconfig"

SRC_URI += "file://j120f.scc \
            file://j120f.cfg \
            file://j120f-user-config.cfg \
            file://j120f-user-patches.scc \
           "


LINUX_VERSION ?= "3.10.9"
LINUX_VERSION_EXTENSION ?= "-wolf"

KERNEL_CC = "arm-oe-linux-gnueabi-gcc"
KERNEL_LD = "arm-oe-linux-gnueabi-ld"
KERNEL_AR = "arm-oe-linux-gnueabi-ar"

SRCREV="${AUTOREV}"

PV = "${LINUX_VERSION}+git${SRCPV}"

COMPATIBLE_MACHINE_j120f = "j120f"
