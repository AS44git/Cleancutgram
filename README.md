# Cleancutgram

Instagram without the engagement-farming parts: no Reels, no algorithmic feed,
no Explore, no suggested accounts, no ads or telemetry. Messages, stories,
search, notifications and profiles stay.

Cleancutgram is a fork of [Feurstagram](https://github.com/jean-voila/FeurStagram)
(v454-0-0-13-77), trimmed down and with its own fixes:

- **Quoicouview mode** (Messages as the main page, stories on top) with the
  missing-stories bug fixed.
- **Permanent lock** that also keeps Quoicouview mode, and so Home, off for good.
- No onboarding, promo or intro cards.
- Its own releases and in-app updater.

See [CHANGELOG.md](CHANGELOG.md) for everything that changed from Feurstagram.

## Install

Download the APK from [Releases](https://github.com/AS44git/Cleancutgram/releases/latest):

- `cleancutgram-<version>.apk` replaces Instagram.
- `cleancutgram-<version>-clone.apk` installs next to it, as "IG".

Long-press the Messages tab (or Home) to open the settings.

## Build

Releases are built by GitHub Actions (*Build and release*, run from the Actions
tab) from a stock Instagram APK attached to a draft release named `stock-apk`.
*Debug build* makes a test APK with the ADB debug bridge on. To build locally,
see [docs/BUILD_FROM_SOURCE.md](docs/BUILD_FROM_SOURCE.md).

When Instagram updates: attach the new stock APK, bump `REVISION` in
`extensions/.../Brand.java`, and run *Build and release*.

## Disclaimer

Unofficial and not affiliated with Instagram or Meta. It is a modified APK
installed outside the Play Store, and using a modified client may violate
Instagram's terms of service. Use it at your own risk.

## License

GPLv3, like Feurstagram. See [LICENSE](LICENSE) and [NOTICE](NOTICE).
