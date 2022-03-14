# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "ViSP standing for Visual Servoing Platform is a modular cross     platform library that allows prototyping and developing applications     using visual tracking and visual servoing technics at the heart of the     researches done by Inria Lagadic team. ViSP is able to compute control     laws that can be applied to robotic systems. It provides a set of visual     features that can be tracked using real time image processing or computer     vision algorithms. ViSP provides also simulation capabilities.      ViSP can be useful in robotics, computer vision, augmented reality     and computer animation."
AUTHOR = "Fabien Spindler <Fabien.Spindler@inria.fr>"
ROS_AUTHOR = "Fabien Spindler"
HOMEPAGE = "http://www.ros.org/wiki/visp"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "GPLv2"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=20;endline=20;md5=fe8b75cf0aba647401e1038bcd69ee74"

ROS_CN = "visp"
ROS_BPN = "visp"

ROS_BUILD_DEPENDS = " \
    bzip2 \
    doxygen \
    jpeg \
    lapack \
    libeigen \
    libpng \
    libx11 \
    libxml2 \
    opencv \
    v4l-utils \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    jpeg \
    lapack \
    libeigen \
    libpng \
    libx11 \
    libxml2 \
    opencv \
    v4l-utils \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/visp-release/archive/release/rolling/visp/3.5.0-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/visp"
SRC_URI = "git://github.com/ros2-gbp/visp-release;${ROS_BRANCH};protocol=https"
SRCREV = "3a340c92c7ab38a927799569bb965e92ec2d3595"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
