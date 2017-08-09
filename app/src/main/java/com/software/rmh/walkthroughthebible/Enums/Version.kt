package com.software.rmh.walkthroughthebible.Enums

/**
 * Created by rhoffman on 8/8/17.
 *
 * When adding new versions of the Bible, they can be added here and used
 * anywhere. This avoids passing Strings everywhere, as well as having to add
 * and update them in multiple places. This is a single point of change.
 */
enum class Version {
    KJV,
    ESV
}