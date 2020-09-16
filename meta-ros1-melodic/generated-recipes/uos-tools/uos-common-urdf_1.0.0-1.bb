# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package contains URDF descriptions of the UOS robots."
AUTHOR = "Jochen Sprickerhof <jochen@sprickerhof.de>"
ROS_AUTHOR = "Jochen Sprickerhof"
HOMEPAGE = "http://ros.org/wiki/uos_common_urdf"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "uos_tools"
ROS_BPN = "uos_common_urdf"

ROS_BUILD_DEPENDS = " \
    gazebo-plugins \
    urdf \
    xacro \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    gazebo-plugins \
    urdf \
    xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gazebo-plugins \
    urdf \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/uos-gbp/uos-tools/archive/release/melodic/uos_common_urdf/1.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/uos_common_urdf"
SRC_URI = "git://github.com/uos-gbp/uos-tools;${ROS_BRANCH};protocol=https"
SRCREV = "6b45bf5eeb4351b3b7330985b7ca79c97de4e82e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}