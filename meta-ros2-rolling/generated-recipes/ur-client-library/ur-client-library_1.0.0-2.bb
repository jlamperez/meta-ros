# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Standalone C++ library for accessing Universal Robots interfaces. This has been forked off the ur_robot_driver."
AUTHOR = "Felix Exner <exner@fzi.de>"
ROS_AUTHOR = "Thomas Timm Andersen"
HOMEPAGE = "http://wiki.ros.org/ur_client_library"
SECTION = "devel"
LICENSE = "Apache-2.0 & BSD-2-Clause & Zlib & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=68073d59fee9cc9e7aa88b8726fba1e1"

ROS_CN = "ur_client_library"
ROS_BPN = "ur_client_library"

ROS_BUILD_DEPENDS = " \
    console-bridge \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    console-bridge \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-cmake \
    console-bridge \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/UniversalRobots/Universal_Robots_Client_Library-release/archive/release/rolling/ur_client_library/1.0.0-2.tar.gz
ROS_BRANCH ?= "branch=release/rolling/ur_client_library"
SRC_URI = "git://github.com/UniversalRobots/Universal_Robots_Client_Library-release;${ROS_BRANCH};protocol=https"
SRCREV = "7e2fa670b1c5fd975f9ba2c3566759ca07467c15"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
