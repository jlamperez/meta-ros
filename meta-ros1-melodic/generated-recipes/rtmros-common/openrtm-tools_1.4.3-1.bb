# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The openrtm_tools package"
AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "http://ros.org/wiki/openrtm_tools"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rtmros_common"
ROS_BPN = "openrtm_tools"

ROS_BUILD_DEPENDS = " \
    openrtm-aist \
    openrtm-aist-python \
    rosbash \
    rostest \
    rtshell \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    openrtm-aist \
    openrtm-aist-python \
    rosbash \
    rtshell \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    openrtm-aist \
    openrtm-aist-python \
    rosbash \
    rtshell \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/rtmros_common-release/archive/release/melodic/openrtm_tools/1.4.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/openrtm_tools"
SRC_URI = "git://github.com/tork-a/rtmros_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "8b92ec29acabe207ef88f706bf216c0af38b04b4"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
