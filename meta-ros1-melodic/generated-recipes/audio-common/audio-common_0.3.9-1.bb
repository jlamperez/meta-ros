# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Common code for working with audio in ROS"
AUTHOR = "Austin Hendrix <namniart@gmail.com>"
ROS_AUTHOR = "Blaise Gassend"
HOMEPAGE = "http://ros.org/wiki/audio_common"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=e412bfc9312ba25bfbb7ea55d4c4409c"

ROS_CN = "audio_common"
ROS_BPN = "audio_common"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    audio-capture \
    audio-common-msgs \
    audio-play \
    sound-play \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    audio-capture \
    audio-common-msgs \
    audio-play \
    sound-play \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/audio_common-release/archive/release/melodic/audio_common/0.3.9-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/audio_common"
SRC_URI = "git://github.com/ros-gbp/audio_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "3efbd6ef4730e0dca48fdb5a32ca4ddbdf823440"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}