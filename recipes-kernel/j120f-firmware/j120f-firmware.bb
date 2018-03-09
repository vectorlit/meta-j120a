DESCRIPTION = "Firmware files for j120f (from Android)"

LICENSE = "CLOSED"

PACKAGE_ARCH = "all"

SRC_URI += " \
    file://firmware/bcm43438A1_V0041.0142.hcd \
    file://firmware/es305_fw.bin \
    file://firmware/es305_fw_bypass.bin \
    file://firmware/mfc_fw.bin \
    file://wifi/bcmdhd_apsta.bin \
    file://wifi/bcmdhd_mfg.bin \
    file://wifi/cred.conf \
    file://wifi/nvram_mfg.txt \
    file://wifi/p2p_supplicant_overlay.conf \
    file://wifi/wpa_supplicant.conf \
"
S = "${WORKDIR}"

do_install () {
    install -d ${D}${base_libdir}/firmware/
    install -m 755 ${S}/firmware/bcm43438A1_V0041.0142.hcd ${D}${base_libdir}/firmware/
    install -m 755 ${S}/firmware/es305_fw.bin ${D}${base_libdir}/firmware/
    install -m 755 ${S}/firmware/es305_fw_bypass.bin ${D}${base_libdir}/firmware/
    install -m 755 ${S}/firmware/mfc_fw.bin ${D}${base_libdir}/firmware/
    install -d ${D}${sysconfdir}/wifi/
    install -m 755 ${S}/wifi/bcmdhd_apsta.bin ${D}${sysconfdir}/wifi/
    install -m 755 ${S}/wifi/bcmdhd_mfg.bin ${D}${sysconfdir}/wifi/
    install -m 755 ${S}/wifi/cred.conf ${D}${sysconfdir}/wifi/
    install -m 755 ${S}/wifi/nvram_mfg.txt ${D}${sysconfdir}/wifi/
    install -m 755 ${S}/wifi/p2p_supplicant_overlay.conf ${D}${sysconfdir}/wifi/
    install -m 755 ${S}/wifi/wpa_supplicant.conf ${D}${sysconfdir}/wifi/
}

FILES_${PN} += " \
    ${base_libdir}/firmware/bcm43438A1_V0041.0142.hcd \
    ${base_libdir}/firmware/es305_fw.bin \
    ${base_libdir}/firmware/es305_fw_bypass.bin \
    ${base_libdir}/firmware/mfc_fw.bin \
    ${base_libdir}/wifi/bcmdhd_apsta.bin \
    ${base_libdir}/wifi/bcmdhd_mfg.bin \
    ${base_libdir}/wifi/cred.conf \
    ${base_libdir}/wifi/nvram_mfg.txt \
    ${base_libdir}/wifi/p2p_supplicant_overlay.conf \
    ${base_libdir}/wifi/wpa_supplicant.conf \
"
