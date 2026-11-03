package com.feurstagram.extension;

/**
 * Everything that names this fork, in one place.
 *
 * To rebrand, change these values AND the matching defaults in
 * {@code patches/.../clone/ClonePatch.kt} (package name and app label), which
 * the patcher reads at build time and cannot share with this class.
 */
public final class Brand {

    private Brand() {}

    /** Shown in the settings title, dialogs and notifications. */
    public static final String APP_NAME = "IG";

    /**
     * The GitHub repository ("owner/name") whose releases the updater checks and
     * downloads from. Until it is set to a real repository, update checks are
     * skipped instead of failing (see {@link #hasUpdateRepo}).
     */
    public static final String GITHUB_REPO = "AS44git/Cleancutgram";

    /**
     * The package suffix of the side-by-side clone build (ClonePatch's default
     * package is "com.instagram.android" + this). The updater uses it to pick
     * the "-clone.apk" release asset for clone installs.
     */
    public static final String CLONE_PACKAGE_SUFFIX = ".cleancutgram";

    /**
     * This fork's own release number, appended to Instagram's version: Instagram
     * 454.0.0.13.77 at revision 3 is version 454.0.0.13.77.3, released under the
     * tag v454-0-0-13-77-3. Bump it for every release, so a fix shipped on the
     * same Instagram version is still offered as an update.
     */
    public static final int REVISION = 1;

    /** Whether {@link #GITHUB_REPO} points at a real repository yet. */
    public static boolean hasUpdateRepo() {
        return !GITHUB_REPO.contains("CHANGE-ME");
    }
}
