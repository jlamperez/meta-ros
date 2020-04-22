# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "hector_pose_estimation provides the hector_pose_estimation node and the hector_pose_estimation nodelet."
AUTHOR = "Johannes Meyer <meyer@fsr.tu-darmstadt.de>"
ROS_AUTHOR = "Johannes Meyer <meyer@fsr.tu-darmstadt.de>"
HOMEPAGE = "http://ros.org/wiki/hector_pose_estimation"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "hector_localization"
ROS_BPN = "hector_pose_estimation"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    hector-pose-estimation-core \
    message-filters \
    nav-msgs \
    nodelet \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    hector-pose-estimation-core \
    message-filters \
    nav-msgs \
    nodelet \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    hector-pose-estimation-core \
    message-filters \
    nav-msgs \
    nodelet \
    sensor-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tu-darmstadt-ros-pkg-gbp/hector_localization-release/archive/release/melodic/hector_pose_estimation/0.3.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/hector_pose_estimation"
SRC_URI = "git://github.com/tu-darmstadt-ros-pkg-gbp/hector_localization-release;${ROS_BRANCH};protocol=https"
SRCREV = "b8744d2f6c6acc747d2a0371e7586e6e19ca23a6"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
