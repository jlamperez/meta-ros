# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Package for managing traffic in the Robotics Middleware Framework"
AUTHOR = "Grey <grey@openrobotics.org>"
ROS_AUTHOR = "Grey"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rmf_traffic"
ROS_BPN = "rmf_traffic"

ROS_BUILD_DEPENDS = " \
    fcl \
    libccd \
    libeigen \
    rmf-utils \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    libeigen \
    rmf-utils \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libeigen \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-catch2 \
    rmf-cmake-uncrustify \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rmf_traffic-release/archive/release/rolling/rmf_traffic/1.3.0-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/rmf_traffic"
SRC_URI = "git://github.com/ros2-gbp/rmf_traffic-release;${ROS_BRANCH};protocol=https"
SRCREV = "89eb04c361a59436a8a4a81c57395f41cd3ca2de"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}