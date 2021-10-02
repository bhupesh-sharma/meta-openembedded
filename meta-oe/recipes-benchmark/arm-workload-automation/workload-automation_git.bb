SUMMARY = "Workload Automation (WA) is a framework for executing workloads and collecting measurements on Android and Linux devices."
HOMEPAGE = "https://github.com/ARM-software/workload-automation"
LICENSE = "Apache v2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "git://github.com/ARM-software/workload-automation.git"
SRCREV = "0b558e408c9ea490b57de340c66d308b937f5e84"

WORKLOAD_NAME = "workload-automation"
S = "${WORKDIR}/git"

do_install() {
    install -d ${D}${bindir}${WORKLOAD_NAME}
    python setup.py install --prefix=${D}${bindir}${WORKLOAD_NAME}
}

RDEPENDS:${PN} += "python3"
