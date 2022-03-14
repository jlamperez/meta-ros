# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "gazebo_ros2_control_demos"
AUTHOR = "Alejandro Hernandez <alejandro@osrfoundation.org>"
ROS_AUTHOR = "Alejandro Hernández"
HOMEPAGE = "http://ros.org/wiki/gazebo_ros_control"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "gazebo_ros2_control"
ROS_BPN = "gazebo_ros2_control_demos"

ROS_BUILD_DEPENDS = " \
    control-msgs \
    rclcpp \
    rclcpp-action \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-gazebo-ros} \
    ament-index-python \
    control-msgs \
    effort-controllers \
    gazebo-ros2-control \
    hardware-interface \
    joint-state-broadcaster \
    joint-trajectory-controller \
    launch \
    launch-ros \
    rclcpp \
    robot-state-publisher \
    ros2-control \
    ros2-controllers \
    std-msgs \
    velocity-controllers \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/gazebo_ros2_control-release/archive/release/rolling/gazebo_ros2_control_demos/0.0.8-2.tar.gz
ROS_BRANCH ?= "branch=release/rolling/gazebo_ros2_control_demos"
SRC_URI = "git://github.com/ros2-gbp/gazebo_ros2_control-release;${ROS_BRANCH};protocol=https"
SRCREV = "5066fadf783d8c03843465d5aa901a0c71cde252"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
