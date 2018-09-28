(ns finn.test-data
  (:require [clojure.test :refer :all]))


(def example-links)

(def example-ad
  {:type    :document,
   :content [{:type :document-type, :attrs {:name "html", :publicid "", :systemid ""}}
             {:type    :element,
              :attrs   {:lang "no", :prefix "og: http://ogp.me/ns#"},
              :tag     :html,
              :content [{:type    :element,
                         :attrs   nil,
                         :tag     :head,
                         :content ["\n"
                                   {:type :element, :attrs {:charset "utf-8"}, :tag :meta, :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name "viewport", :content "width=device-width, initial-scale=1"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:http-equiv "X-UA-Compatible", :content "IE=Edge"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   nil,
                                    :tag     :title,
                                    :content ["Onsker du aa jobbe med leveranser/integrasjoner  i et spennende selskap? | FINN.no"]}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:rel         "preload",
                                              :href        "https://static.finncdn.no/_c/mfinn/static/dist/mfinn.a408ab8a.js",
                                              :as          "script",
                                              :crossorigin ""},
                                    :tag     :link,
                                    :content nil}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:rel "dns-prefetch", :href "https://images.finncdn.no"},
                                    :tag     :link,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:rel "preconnect", :href "https://images.finncdn.no"},
                                    :tag     :link,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:rel  "stylesheet",
                                              :href "https://static.finncdn.no/_c/spaden/v8.5.6/spaden.min.css"},
                                    :tag     :link,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:rel         "stylesheet",
                                              :href        "https://static.finncdn.no/_c/mfinn/static/dist/mfinn.c514c6aa.css",
                                              :crossorigin ""},
                                    :tag     :link,
                                    :content nil}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   nil,
                                    :tag     :style,
                                    :content ["
                                                 button.blank:focus {
                                                     box-shadow: none;
                                                 }

                                                 /* element name for specificity, remove when moving to spaden */
                                                 button.lightbox-left,
                                                 button.lightbox-right {
                                                     padding: 0;
                                                     top: -webkit-calc(50% - 50px);
                                                     top: calc(50% - 50px);
                                                     -webkit-tap-highlight-color: rgba(0, 0, 0, 0);
                                                     padding: 20px;
                                                 }

                                                 .lightbox-arrow-icon {
                                                     background: rgba(0, 0, 0, 0.3);
                                                     box-sizing: content-box;
                                                     padding: 10px;
                                                     border-radius: 3px;
                                                 }

                                                 .probably-touch .lightbox-left,
                                                 .probably-touch .lightbox-right {
                                                     opacity: 0.5; /* No hover state, fix this properly when moving to spade */
                                                 }

                                                 button.lightbox-left {
                                                     left: 0;
                                                     padding-left: 5px;
                                                 }

                                                 button.lightbox-right {
                                                     right: 0;
                                                     padding-right: 5px;
                                                 }

                                                 .gallery-image-caption {
                                                     position: absolute;
                                                     bottom: 0;
                                                     left: 0;
                                                     right: 0;
                                                     display: -webkit-flex;
                                                     display: -ms-flexbox;
                                                     display: flex;
                                                     -webkit-justify-content: center;
                                                     -ms-justify-content: center;
                                                     -ms-flex-pack: center;
                                                     justify-content: center;
                                                 }

                                                 .gallery-image-caption-text {
                                                     background: rgba(0, 0, 0, 0.4);
                                                     padding: 1px 5px;
                                                 }

                                             "]}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name "format-detection", :content "telephone=no"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name "FINN.marketplace", :content "job"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name    "FINN.trackinginput",
                                              :content "%7B%22context%22%3A%22job%2Ffulltime%22%2C%22parameters%22%3A%7B%22audienceScience%22%3A%7B%22sektorid%22%3A%22Privat%22%2C%22stilling%22%3A%22IT+utvikling%22%2C%22bransje%22%3A%22IT%22%2C%22postnummer%22%3A%224016%22%2C%22understilling%22%3A%22Systemarkitekt%22%7D%7D%7D"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name "FINN.visitorId", :content "wVBJf2N15jV"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name "FINN.visitorSessionId", :content "hYKwZEec2fV"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name    "FINN.pulseOptions",
                                              :content "%7B%22category%22%3A%22job+%3E+job-full-time%22%2C%22contentId%22%3A%22130001312%22%2C%22contentType%22%3A%22ClassifiedAd%22%2C%22tags%22%3A%5B%22konfigurering%22%2C%22systemutvikling%22%2C%22programmering%22%2C%22leveranse%22%2C%22microsoft%22%5D%2C%22contentLocation%22%3A%7B%22latitude%22%3A58.9465217590332%2C%22accuracy%22%3A5%2C%22longitude%22%3A5.7362236976623535%7D%7D"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name "FINN.feed", :content "%7B%7D"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name    "FINN.banner.appNexus",
                                              :content "%7B%22debug%22%3Afalse%2C%22error%22%3A%22Unknown%20uri%3A%20job%2Ffulltime%2Fobject%22%7D"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:name "csrf-token", :content "HOqcVZcQMrwJqbfQy11g9k6WwIhTLgJJr0Elu4gbLxQ="},
                                    :tag     :meta,
                                    :content nil}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:name "sitesettings.spidClientId", :content "5087dc1b421c7a0b79000000"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name "sitesettings.spidBaseUri", :content "https://payment.schibsted.no"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name "sitesettings.spidHostname", :content "payment.schibsted.no"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name "sitesettings.wwwSite", :content "https://www.finn.no"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name "sitesettings.cdnUrl", :content "https://static.finncdn.no/_c/mfinn"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name "sitesettings.imageCdnUrl", :content "https://images.finncdn.no"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name "sitesettings.timingEnabled", :content "true"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name "sitesettings.streamBannerPosition", :content "3"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name    "sitesettings.streamingSuggestFrontPageEndPoint",
                                              :content "/search/front/streamingsuggest"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name    "sitesettings.suggestFrontPageEndPoint",
                                              :content "/search/front/suggest"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name    "sitesettings.trustProfileApiUri",
                                              :content "https://profile-api.trust.schibsted.io"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name    "sitesettings.trustFeedbackApiUri",
                                              :content "https://feedback-api.trust.schibsted.io"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name "sitesettings.isProd", :content "true"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name "sitesettings.lazyLoadBanners", :content "true"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name "sitesettings.trackInscreen", :content "true"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name "promotion.extendedProfile", :content "false"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:rel  "icon",
                                              :href "https://static.finncdn.no/_c/spaden/v8.5.0/favicons/favicon.ico"},
                                    :tag     :link,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:rel   "icon",
                                              :href  "https://static.finncdn.no/_c/spaden/v8.5.0/favicons/favicon-t-32x32.png",
                                              :sizes "32x32"},
                                    :tag     :link,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:rel   "icon",
                                              :href  "https://static.finncdn.no/_c/spaden/v8.5.0/favicons/favicon-t-192x192.png",
                                              :sizes "192x192"},
                                    :tag     :link,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:rel   "icon",
                                              :href  "https://static.finncdn.no/_c/spaden/v8.5.0/favicons/favicon-t-96x96.png",
                                              :sizes "96x96"},
                                    :tag     :link,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:rel   "icon",
                                              :href  "https://static.finncdn.no/_c/spaden/v8.5.0/favicons/favicon-t-16x16.png",
                                              :sizes "16x16"},
                                    :tag     :link,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:rel  "apple-touch-icon",
                                              :href "https://static.finncdn.no/_c/spaden/v8.5.0/favicons/apple-touch-icon-180x180.png"},
                                    :tag     :link,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:rel   "mask-icon",
                                              :href  "https://static.finncdn.no/_c/spaden/v8.5.0/favicons/icon.svg",
                                              :color "#06befb"},
                                    :tag     :link,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name "msapplication-TileColor", :content "#06befb"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name    "msapplication-TileImage",
                                              :content "https://static.finncdn.no/_c/spaden/v8.5.0/favicons/mstile-144x144.png"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name "theme-color", :content "#06befb"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name    "msapplication-config",
                                              :content "https://static.finncdn.no/_c/spaden/v8.5.0/manifests/browserconfig.xml"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:rel  "manifest",
                                              :href "https://static.finncdn.no/_c/spaden/v8.5.0/manifests/manifest.json"},
                                    :tag     :link,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:property "fb:app_id", :content "1375962765972285"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:property "og:site_name", :content "FINN.no"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:property "og:type", :content "website"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:rel  "canonical",
                                              :href "https://www.finn.no/job/fulltime/ad.html?finnkode=130001312"},
                                    :tag     :link,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:property "og:url",
                                              :content  "https://www.finn.no/job/fulltime/ad.html?finnkode=130001312"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name    "description",
                                              :content "Centric er et av Europas mest offensive IT selskaper, med over 5000 ansatte. I Norge har vi en spennende reise foran oss. Vi har en ambisios maalsetning om sterk vekst og er derfor paa jakt etter de beste IT-hodene som kan gjore en forskjell. I Centric vil du faa utfordrende oppdrag i et sterkt fagmiljo. Vi tilbyr faglig utvikling og en tilpasset karriereplan innenfor ditt kompetanseomraade. Vi har..."},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:property "og:title",
                                              :content  "Onsker du aa jobbe med leveranser/integrasjoner i et spennende selskap?"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:property "og:description",
                                              :content  "Centric er et av Europas mest offensive IT selskaper, med over 5000 ansatte. I Norge har vi en spennende reise foran oss. Vi har en ambisios maalsetning om sterk vekst og er derfor paa jakt etter de beste IT-hodene som kan gjore en forskjell. I Centric vil du faa utfordrende oppdrag i et sterkt fagmiljo. Vi tilbyr faglig utvikling og en tilpasset karriereplan innenfor ditt kompetanseomraade. Vi har..."},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:property "og:image",
                                              :content  "https://static.finncdn.no/_c/mfinn/static/images/jobs.c335e4f7.png"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:property "og:image:width", :content "450"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:property "og:image:height", :content "350"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name "twitter:card", :content "summary_large_image"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name "twitter:site", :content "@FINN_no"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:name    "apple-itunes-app",
                                              :content "app-id=526541908,affiliate-data=pt=295309&ct=smart-app-banner,app-argument=finn://finn/object?finnkode=130001312"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:property "al:ios:url", :content "finn://finn/object?finnkode=130001312"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:property "al:ios:app_store_id", :content "526541908"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:property "al:ios:app_name", :content "FINN.no"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:property "al:android:url", :content "finn://object/130001312"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:property "al:android:package", :content "no.finn.android"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:property "al:android:app_name", :content "FINN.no"},
                                    :tag     :meta,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   nil,
                                    :tag     :script,
                                    :content ["
                                                 window.dataLayer = window.dataLayer || [];
                                                 function gtag(){dataLayer.push(arguments);}
                                                 gtag('js', new Date());
                                                 gtag('config', 'AW-1050677447');
                                             "]}
                                   "\n"]}
                        "\n\n"
                        {:type    :element,
                         :attrs   {:class           "no-focus-ring probably-not-touch",
                                   :data-controller "spidSync screenCapabilities focusStyling dataTrackClick detailsPolyfillInit matchingCookie clientStats"},
                         :tag     :body,
                         :content ["\n"
                                   {:type    :element,
                                    :attrs   {:href "#ad-start-link", :class "skiplink"},
                                    :tag     :a,
                                    :content ["Gaa til annonsen"]}
                                   "\n"
                                   {:type :comment, :content [" finnlet-topbar v6.1.19 "]}
                                   " "
                                   {:type    :element,
                                    :attrs   {:scoped ""},
                                    :tag     :style,
                                    :content [".top-bar-top-bar-3kKPI{background-color:#fff;border-bottom:1px solid #ddd;height:50px;position:fixed;width:100%;z-index:3;will-change:transform}a.top-bar-top-bar-3kKPI,.top-bar-top-bar-3kKPI a,a.top-bar-top-bar-3kKPI:link,.top-bar-top-bar-3kKPI a:link,a.top-bar-top-bar-3kKPI:visited,.top-bar-top-bar-3kKPI a:visited{cursor:pointer;color:#474445;text-decoration:none}a.top-bar-top-bar-3kKPI:hover,.top-bar-top-bar-3kKPI a:hover,a.top-bar-top-bar-3kKPI:active,.top-bar-top-bar-3kKPI a:active,a.top-bar-top-bar-3kKPI:focus,.top-bar-top-bar-3kKPI a:focus{text-decoration:none}@media print{.top-bar-top-bar-3kKPI{position:relative}}.top-bar-top-bar__spacer-2B-vV{height:66px}@media print{.top-bar-top-bar__spacer-2B-vV{display:none}}.top-bar-top-bar__nav-1O8LN{background-color:#fff;padding:0;margin:0;max-width:1010px;height:49px;min-width:0;display:-ms-flexbox;display:-webkit-flex;display:flex;-ms-flex:0 1 auto;-webkit-flex:0 1 auto;flex:0 1 auto;-ms-flex-align:stretch;-webkit-align-items:stretch;align-items:stretch}.top-bar-top-bar__nav-1O8LN.top-bar-content-width--liquid-2eefg,.top-bar-content-width--liquid-2eefg .top-bar-top-bar__nav-1O8LN{max-width:none}.top-bar-top-bar__nav-1O8LN.top-bar-content-width--1400-KuH9v,.top-bar-content-width--1400-KuH9v .top-bar-top-bar__nav-1O8LN{max-width:1400px}.top-bar-top-bar__nav-1O8LN.top-bar-content-width--1600-3LJ43,.top-bar-content-width--1600-3LJ43 .top-bar-top-bar__nav-1O8LN{max-width:1600px}@media(min-width:1300px){.top-bar-top-bar__nav-1O8LN{margin-left:auto;margin-right:auto}}@media(min-width:1300px){.top-bar-top-bar__nav-1O8LN{padding:0 15px}}.top-bar-top-bar__home-2FLQQ{display:-ms-flexbox;display:-webkit-flex;display:flex;margin-left:16px;padding-top:2px;border-bottom:2px solid #fff}@media(min-width:768px){.top-bar-top-bar__home-2FLQQ{margin-right:auto}}.top-bar-top-bar__home__logo-KVd42,.top-bar-top-bar__home__logo-small-3rv2e,.top-bar-top-bar__home__title-1EgMU,.top-bar-top-bar__home__subtitle-QVm6n{display:block;-ms-flex-item-align:center;-webkit-align-self:center;-ms-grid-row-align:center;align-self:center}.top-bar-top-bar__home__logo-KVd42 svg,.top-bar-top-bar__home__logo-small-3rv2e svg,.top-bar-top-bar__home__title-1EgMU svg,.top-bar-top-bar__home__subtitle-QVm6n svg{display:block}@media(max-width:767px){.top-bar-top-bar__home__logo-KVd42{display:none}}@media(min-width:768px){.top-bar-top-bar__home__logo-small-3rv2e{display:none}}.top-bar-top-bar__home__title-1EgMU,.top-bar-top-bar__home__subtitle-QVm6n{font-size:12px;margin-left:8px}@media(max-width:989px){.top-bar-top-bar__home__title-1EgMU,.top-bar-top-bar__home__subtitle-QVm6n{display:none}}.top-bar-top-bar__home__title-1EgMU{font-weight:bold}.top-bar-top-bar__home-2FLQQ:focus{border-bottom:2px solid #06befb}.top-bar-top-bar__menu-item-3kxIT{position:relative;font-size:12px;white-space:nowrap;text-align:center;min-width:0;padding:8px 20px 0 20px;border-bottom:3px solid #fff;display:-ms-flexbox;display:-webkit-flex;display:flex;-ms-flex:0 1 auto;-webkit-flex:0 1 auto;flex:0 1 auto;-ms-flex-align:center;-webkit-align-items:center;align-items:center;height:100%;display:inline-block}@media(max-width:767px){.top-bar-top-bar__menu-item-3kxIT{-ms-flex:1 1 auto;-webkit-flex:1 1 auto;flex:1 1 auto;padding-right:0;padding-left:0}}@media print{.top-bar-top-bar__menu-item-3kxIT{display:none}}.top-bar-top-bar__menu-item-3kxIT:hover,.top-bar-top-bar__menu-item-3kxIT:focus,.top-bar-top-bar__menu-item--is-active-wVLMi{border-bottom:2px solid #06befb}.top-bar-top-bar__menu-item__title-6ui1p{margin-left:8px}@media(max-width:767px){.top-bar-top-bar__menu-item__title-6ui1p{display:none}}.top-bar-top-bar__menu-item__profile-picture-3Xcbd{height:34px;width:34px;border-radius:50%;border:2px solid #06befb}.top-bar-top-bar__menu-item__notification-1V6JT{background-color:#da2400;color:#fff;height:18px;min-width:18px;line-height:19px;font-size:11px;border-radius:18px;padding:0 4px;position:absolute;left:43px;top:2px}@media(max-width:767px){.top-bar-top-bar__menu-item__notification-1V6JT{right:auto;left:calc(50% + 5px)}}.top-bar-top-bar__menu-item-3kxIT svg{color:#06befb}.top-bar-top-bar__menu-item-3kxIT svg,.top-bar-top-bar__menu-item-3kxIT img{vertical-align:middle}"]}
                                   {:type    :element,
                                    :attrs   {:class "top-bar-top-bar-3kKPI"},
                                    :tag     :header,
                                    :content [{:type    :element,
                                               :attrs   nil,
                                               :tag     :script,
                                               :content ["window.pulse2opt = window.pulse2opt || {\"clientId\":\"finn\",\"userIdDomain\":\"spid.no\"};"]}
                                              {:type    :element,
                                               :attrs   {:role       "img",
                                                         :aria-label "FINN.no logoen viser navnet FINN skrevet med hvit skrift i et lyseblaatt rektangel til hoyre for en morkeblaa kvartsirkel."},
                                               :tag     :span,
                                               :content nil}
                                              {:type    :element,
                                               :attrs   {:class      "top-bar-top-bar__nav-1O8LN notranslate",
                                                         :aria-label "Hovednavigasjon"},
                                               :tag     :nav,
                                               :content [{:type    :element,
                                                          :attrs   {:href               "//www.finn.no/",
                                                                    :class              "top-bar-top-bar__home-2FLQQ",
                                                                    :aria-current       "false",
                                                                    :aria-label         "Forside",
                                                                    :data-automation-id "frontpage-link"},
                                                          :tag     :a,
                                                          :content [{:type    :element,
                                                                     :attrs   {:class "top-bar-top-bar__home__logo-small-3rv2e"},
                                                                     :tag     :span,
                                                                     :content [{:type    :element,
                                                                                :attrs   {:focusable "false",
                                                                                          :width     "62",
                                                                                          :height    "32",
                                                                                          :viewbox   "0 0 124 64"},
                                                                                :tag     :svg,
                                                                                :content [{:type    :element,
                                                                                           :attrs   nil,
                                                                                           :tag     :title,
                                                                                           :content [" FINN.no "]}
                                                                                          {:type    :element,
                                                                                           :attrs   {:fill "#06bffc",
                                                                                                     :d    "M119.8 58V6c0-1-.8-1.9-1.9-1.9H66c-1 0-1.9.8-1.9 1.9v53.8H118c1 0 1.8-.8 1.8-1.8"},
                                                                                           :tag     :path,
                                                                                           :content nil}
                                                                                          {:type    :element,
                                                                                           :attrs   {:fill "#0063fc",
                                                                                                     :d    "M22.5 4.2H6C5 4.2 4.2 5 4.2 6v52c0 1 .8 1.9 1.9 1.9H60V41.5C59.9 20.9 43.2 4.2 22.5 4.2"},
                                                                                           :tag     :path,
                                                                                           :content nil}
                                                                                          {:type    :element,
                                                                                           :attrs   {:fill "#fff",
                                                                                                     :d    "M118 0H66c-3.3 0-6 2.7-6 6v17.4C53.2 9.6 38.9 0 22.5 0H6C2.7 0 0 2.7 0 6v52c0 3.3 2.7 6 6 6h112c3.3 0 6-2.7 6-6V6c0-3.3-2.7-6-6-6m1.8 58c0 1-.8 1.9-1.9 1.9H64.1V6c0-1 .8-1.9 1.9-1.9h52c1 0 1.9.8 1.9 1.9v52zM4.2 58V6C4.2 5 5 4.2 6 4.2h16.5c20.6 0 37.4 16.8 37.4 37.4v18.3H6c-1-.1-1.8-.9-1.8-1.9"},
                                                                                           :tag     :path,
                                                                                           :content nil}]}]}
                                                                    {:type    :element,
                                                                     :attrs   {:class "top-bar-top-bar__home__logo-KVd42"},
                                                                     :tag     :span,
                                                                     :content [{:type    :element,
                                                                                :attrs   {:focusable "false",
                                                                                          :width     "92",
                                                                                          :height    "32",
                                                                                          :viewbox   "0 0 184 64"},
                                                                                :tag     :svg,
                                                                                :content [{:type    :element,
                                                                                           :attrs   nil,
                                                                                           :tag     :title,
                                                                                           :content [" FINN.no "]}
                                                                                          {:type    :element,
                                                                                           :attrs   {:fill "#06bffc",
                                                                                                     :d    "M179.8 58V6c0-1-.8-1.9-1.9-1.9H66c-1 0-1.9.8-1.9 1.9v53.8H178c1 0 1.8-.8 1.8-1.8"},
                                                                                           :tag     :path,
                                                                                           :content nil}
                                                                                          {:type    :element,
                                                                                           :attrs   {:fill "#0063fc",
                                                                                                     :d    "M22.5 4.2H6C5 4.2 4.2 5 4.2 6v52c0 1 .8 1.9 1.9 1.9H60V41.5C59.9 20.9 43.2 4.2 22.5 4.2"},
                                                                                           :tag     :path,
                                                                                           :content nil}
                                                                                          {:type    :element,
                                                                                           :attrs   {:fill "#fff",
                                                                                                     :d    "M178 0H66c-3.3 0-6 2.7-6 6v17.4C53.2 9.6 38.9 0 22.5 0H6C2.7 0 0 2.7 0 6v52c0 3.3 2.7 6 6 6h172c3.3 0 6-2.7 6-6V6c0-3.3-2.7-6-6-6m1.8 58c0 1-.8 1.9-1.9 1.9H64.1V6c0-1 .8-1.9 1.9-1.9h112c1 0 1.9.8 1.9 1.9v52zM4.2 58V6C4.2 5 5 4.2 6 4.2h16.5c20.6 0 37.4 16.8 37.4 37.4v18.3H6c-1-.1-1.8-.9-1.8-1.9"},
                                                                                           :tag     :path,
                                                                                           :content nil}
                                                                                          {:type    :element,
                                                                                           :attrs   {:fill "#fff",
                                                                                                     :d    "M110.1 21.1h-4.2c-.7 0-1.2.5-1.2 1.2v19.3c0 .7.5 1.2 1.2 1.2h4.2c.7 0 1.2-.5 1.2-1.2V22.3c0-.6-.6-1.2-1.2-1.2m-12 0H83c-.7 0-1.2.5-1.2 1.2v19.3c0 .7.5 1.2 1.2 1.2h4.2c.7 0 1.2-.5 1.2-1.2v-4h7.7c.7 0 1.2-.5 1.2-1.2v-3.2c0-.7-.5-1.2-1.2-1.2h-7.7v-4.9h9.7c.7 0 1.2-.5 1.2-1.2v-3.7c0-.5-.6-1.1-1.2-1.1m62.8 0h-4.2c-.7 0-1.2.5-1.2 1.2v9.5l-6.6-10c-.3-.4-.8-.7-1.3-.7h-3.2c-.7 0-1.2.5-1.2 1.2v19.3c0 .7.5 1.2 1.2 1.2h4.2c.7 0 1.2-.5 1.2-1.2v-9.4l6.5 9.8c.3.4.8.7 1.3.7h3.4c.7 0 1.2-.5 1.2-1.2V22.3c-.1-.6-.6-1.2-1.3-1.2m-25.4 0h-4.2c-.7 0-1.2.5-1.2 1.2v9.5l-6.6-10c-.3-.4-.8-.7-1.3-.7H119c-.7 0-1.2.5-1.2 1.2v19.3c0 .7.5 1.2 1.2 1.2h4.2c.7 0 1.2-.5 1.2-1.2v-9.4l6.5 9.8c.3.4.8.7 1.3.7h3.4c.7 0 1.2-.5 1.2-1.2V22.3c-.1-.6-.6-1.2-1.3-1.2"},
                                                                                           :tag     :path,
                                                                                           :content nil}]}]}
                                                                    {:type    :element,
                                                                     :attrs   {:aria-hidden "true",
                                                                               :class       "top-bar-top-bar__home__title-1EgMU"},
                                                                     :tag     :span,
                                                                     :content ["Mulighetenes marked"]}]}
                                                         {:type    :element,
                                                          :attrs   {:href               "//www.finn.no/notifications.html",
                                                                    :class              " top-bar-top-bar__menu-item-3kxIT",
                                                                    :aria-current       "false",
                                                                    :aria-label         "Varslinger",
                                                                    :data-automation-id "notifications-link",
                                                                    :title              "Varslinger"},
                                                          :tag     :a,
                                                          :content [{:type    :element,
                                                                     :attrs   {:xmlns   "http://www.w3.org/2000/svg",
                                                                               :width   "32",
                                                                               :height  "32",
                                                                               :viewbox "0 0 32 32"},
                                                                     :tag     :svg,
                                                                     :content [{:type    :element,
                                                                                :attrs   {:fill      "none",
                                                                                          :fill-rule "evenodd"},
                                                                                :tag     :g,
                                                                                :content [{:type    :element,
                                                                                           :attrs   {:fill      "currentColor",
                                                                                                     :fill-rule "nonzero",
                                                                                                     :d         "M20.001 16.998v.004h-2v-.004H18v-2H18V6.502l-8.5 8.5H12v-.004h2v.004H14v2H14v8.496l8.5-8.5H20zm0-2h7.331L12 30.33V17.002H4.668L20 1.67v13.329z"},
                                                                                           :tag     :path,
                                                                                           :content nil}]}]}
                                                                    " "
                                                                    {:type    :element,
                                                                     :attrs   {:class "top-bar-top-bar__menu-item__title-6ui1p translate"},
                                                                     :tag     :span,
                                                                     :content ["Varslinger"]}]}
                                                         {:type    :element,
                                                          :attrs   {:href               "//www.finn.no/innfinn/",
                                                                    :class              " top-bar-top-bar__menu-item-3kxIT ",
                                                                    :aria-current       "false",
                                                                    :data-automation-id "new-ad-link",
                                                                    :title              "Ny annonse"},
                                                          :tag     :a,
                                                          :content [{:type    :element,
                                                                     :attrs   {:xmlns   "http://www.w3.org/2000/svg",
                                                                               :width   "32",
                                                                               :height  "32",
                                                                               :viewbox "0 0 32 32"},
                                                                     :tag     :svg,
                                                                     :content [{:type    :element,
                                                                                :attrs   {:fill      "none",
                                                                                          :fill-rule "evenodd"},
                                                                                :tag     :g,
                                                                                :content [{:type    :element,
                                                                                           :attrs   {:d "M0 0h32v32H0z"},
                                                                                           :tag     :path,
                                                                                           :content nil}
                                                                                          {:type    :element,
                                                                                           :attrs   {:fill      "currentColor",
                                                                                                     :fill-rule "nonzero",
                                                                                                     :d         "M17 15V4h-2v11H4v2h11v11h2V17h11v-2z"},
                                                                                           :tag     :path,
                                                                                           :content nil}]}]}
                                                                    {:type    :element,
                                                                     :attrs   {:class "top-bar-top-bar__menu-item__title-6ui1p translate"},
                                                                     :tag     :span,
                                                                     :content ["Ny annonse"]}]}
                                                         {:type    :element,
                                                          :attrs   {:href               "//www.finn.no/meldinger",
                                                                    :class              " top-bar-top-bar__menu-item-3kxIT",
                                                                    :aria-current       "false",
                                                                    :aria-label         "Meldinger",
                                                                    :data-automation-id "inbox-link",
                                                                    :title              "Meldinger"},
                                                          :tag     :a,
                                                          :content [{:type    :element,
                                                                     :attrs   {:xmlns   "http://www.w3.org/2000/svg",
                                                                               :width   "32",
                                                                               :height  "32",
                                                                               :viewbox "0 0 32 32"},
                                                                     :tag     :svg,
                                                                     :content [{:type    :element,
                                                                                :attrs   {:fill      "currentColor",
                                                                                          :fill-rule "evenodd",
                                                                                          :d         "M12.259 20.997a10.015 10.015 0 0 1 7.006-10.887c-1.162-2.987-4.058-5.108-7.455-5.108a8.007 8.007 0 0 0-8.005 8.009c0 1.251.188 2.078.692 3.252l.252.587-.67 3.112 2.894-.511.664.438c.912.6 2.703 1.13 4.173 1.13.15 0 .3-.013.449-.022zm.467 1.98c-.302.027-.606.045-.916.045-2.028 0-4.172-.735-5.273-1.46l-5.042.89 1.164-5.399c-.533-1.241-.856-2.352-.856-4.042C1.803 7.48 6.283 3 11.81 3c4.373 0 8.08 2.81 9.442 6.72.306-.027.616-.042.93-.042 5.526 0 10.006 4.482 10.006 10.011 0 1.69-.323 2.8-.856 4.042l1.163 5.398-5.041-.89c-1.102.726-3.245 1.461-5.273 1.461-4.375 0-8.095-2.81-9.455-6.723zm16.515.551l.252-.587c.505-1.175.693-2 .693-3.252a8.007 8.007 0 0 0-8.005-8.009 8.007 8.007 0 0 0-8.005 8.01 8.007 8.007 0 0 0 8.005 8.008c1.47 0 3.26-.53 4.172-1.131l.665-.438 2.894.51-.67-3.11zm-9.908-2.838a1 1 0 1 1 0-2.002 1 1 0 0 1 0 2.002zm3.002 0a1 1 0 1 1 0-2.002 1 1 0 0 1 0 2.002zm3.002 0a1 1 0 1 1 0-2.002 1 1 0 0 1 0 2.002z"},
                                                                                :tag     :path,
                                                                                :content nil}]}
                                                                    " "
                                                                    {:type    :element,
                                                                     :attrs   {:class "top-bar-top-bar__menu-item__title-6ui1p translate"},
                                                                     :tag     :span,
                                                                     :content ["Meldinger"]}]}
                                                         {:type    :element,
                                                          :attrs   {:href               "//www.finn.no/user.html",
                                                                    :class              " top-bar-top-bar__menu-item-3kxIT",
                                                                    :aria-current       "false",
                                                                    :data-automation-id "profile-link",
                                                                    :title              "Min FINN"},
                                                          :tag     :a,
                                                          :content [{:type    :element,
                                                                     :attrs   {:xmlns   "http://www.w3.org/2000/svg",
                                                                               :width   "32",
                                                                               :height  "32",
                                                                               :viewbox "0 0 32 32"},
                                                                     :tag     :svg,
                                                                     :content [{:type    :element,
                                                                                :attrs   {:fill      "none",
                                                                                          :fill-rule "evenodd"},
                                                                                :tag     :g,
                                                                                :content [{:type    :element,
                                                                                           :attrs   {:fill      "currentColor",
                                                                                                     :fill-rule "nonzero",
                                                                                                     :d         "M12.08 18.226a8 8 0 1 1 7.84 0c5.116 1.263 9.32 4.95 11.08 9.89l-1.874.63c-1.919-5.385-7.16-9.07-13.125-9.07-5.967 0-11.21 3.687-13.126 9.074L1 28.121c1.758-4.94 5.964-8.63 11.08-9.895zM16 17.25a6 6 0 1 0 0-12 6 6 0 0 0 0 12z"},
                                                                                           :tag     :path,
                                                                                           :content nil}]}]}
                                                                    {:type    :element,
                                                                     :attrs   {:class "top-bar-top-bar__menu-item__title-6ui1p translate"},
                                                                     :tag     :span,
                                                                     :content ["Min FINN"]}]}]}]}
                                   {:type    :element,
                                    :attrs   {:class "top-bar-top-bar__spacer-2B-vV"},
                                    :tag     :div,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:style "display: none;"},
                                    :tag     :svg,
                                    :content ["\n\n"
                                              {:type    :element,
                                               :attrs   {:id "icon-share-email", :viewbox "0 0 34 34"},
                                               :tag     :symbol,
                                               :content ["\n"
                                                         {:type    :element,
                                                          :attrs   {:fill "currentColor"},
                                                          :tag     :g,
                                                          :content ["\n"
                                                                    {:type    :element,
                                                                     :attrs   {:d "M4.5 8v17c0 .5.5 1 1 1h23c.6 0 1-.4 1-1V8c0-.5-.5-1-1-1h-23c-.6 0-1 .4-1 1zm-2 0c0-1.7 1.3-3 3-3h23c1.6 0 3 1.3 3 3v17c0 1.7-1.3 3-3 3h-23c-1.6 0-3-1.3-3-3V8z"},
                                                                     :tag     :path,
                                                                     :content nil}
                                                                    "\n"
                                                                    {:type    :element,
                                                                     :attrs   {:d "M20 18l-1.6 1.5c-.8.8-2 .8-2.8 0L14 18l-8.8 8.7-1.4-1.4 8.8-8.8-8.8-8.8 1.4-1.4L17 18 28.8 6.4l1.4 1.4-8.8 8.8 8.8 8.8-1.4 1.4L20 18z"},
                                                                     :tag     :path,
                                                                     :content nil}
                                                                    "\n"]}
                                                         "\n"]}
                                              "\n\n"
                                              {:type    :element,
                                               :attrs   {:id "icon-share-facebook", :viewbox "0 0 34 34"},
                                               :tag     :symbol,
                                               :content ["\n"
                                                         {:type    :element,
                                                          :attrs   {:fill "none", :fill-rule "evenodd"},
                                                          :tag     :g,
                                                          :content ["\n"
                                                                    {:type    :element,
                                                                     :attrs   {:fill "currentColor",
                                                                               :d    "M27.19 27.955c.7 0 1.265-.566 1.265-1.264V6.317c0-.698-.566-1.264-1.264-1.264H6.817c-.698 0-1.264.567-1.264 1.265V26.69c0 .7.567 1.265 1.265 1.265H27.19z"},
                                                                     :tag     :path,
                                                                     :content nil}
                                                                    "\n"
                                                                    {:type    :element,
                                                                     :attrs   {:fill "#FFFFFF ",
                                                                               :d    "M21.352 27.953v-8.87h2.977l.443-3.457H21.35V13.42c0-1.002.278-1.684 1.714-1.684h1.83V8.642c-.316-.042-1.403-.136-2.667-.136-2.64 0-4.446 1.61-4.446 4.57v2.55h-2.983v3.456h2.985v8.87h3.57z"},
                                                                     :tag     :path,
                                                                     :content nil}
                                                                    "\n"]}
                                                         "\n"]}
                                              "\n\n"
                                              {:type    :element,
                                               :attrs   {:id "icon-share-twitter", :viewbox "0 0 34 34"},
                                               :tag     :symbol,
                                               :content ["\n"
                                                         {:type    :element,
                                                          :attrs   {:fill      "currentColor",
                                                                    :fill-rule "evenodd",
                                                                    :d         "M11.8 28.5c10.6 0 16.3-9 16.3-16.5v-.8c1.3-.8 2.2-1.8 3-3-1 .5-2 .8-3.3 1 1.2-.8 2-2 2.5-3.3-1 .6-2.3 1-3.6 1.3-1-1-2.6-1.8-4.2-1.8-3.2 0-5.8 2.6-5.8 5.8 0 .5 0 1 .2 1.3-4.8-.2-9-2.5-12-6-.4.8-.6 1.8-.6 3 0 2 1 3.7 2.5 4.7-1 0-1.8-.3-2.6-.7 0 3 2 5.2 4.7 5.8l-1.5.2h-1c.7 2.2 2.8 4 5.3 4C9.5 25 7 26 4.5 26H3c2.5 1.5 5.6 2.5 8.8 2.5"},
                                                          :tag     :path,
                                                          :content nil}
                                                         "\n"]}
                                              "\n\n"
                                              {:type    :element,
                                               :attrs   {:id "icon-share-favorite-empty", :viewbox "0 0 34 34"},
                                               :tag     :symbol,
                                               :content ["\n"
                                                         {:type    :element,
                                                          :attrs   {:fill-rule "nonzero",
                                                                    :fill      "currentColor",
                                                                    :d         "M5.8 10.33c-2.08 2.64-1.6 6.44 1 8.48l.16.13.43.32L8.9 20.4c1.58 1.2 3.16 2.4 4.64 3.5 1.3 1 2.46 1.86 3.44 2.6l3.43-2.6 4.65-3.5 1.53-1.15.56-.42c2.65-2.06 3.12-5.86 1.05-8.5-2.06-2.63-5.9-3.1-8.5-1.06L17 11.45l-2.68-2.17C11.67 7.23 7.85 7.7 5.8 10.33zm9.76-2.62L17 8.88l1.43-1.16c3.52-2.73 8.6-2.1 11.36 1.4 2.74 3.5 2.1 8.56-1.4 11.3L17 29 5.6 20.4c-3.5-2.73-4.13-7.8-1.4-11.3 2.76-3.5 7.84-4.13 11.36-1.4z"},
                                                          :tag     :path,
                                                          :content nil}
                                                         "\n"]}
                                              "\n\n"
                                              {:type    :element,
                                               :attrs   {:id "icon-share-favorite-filled", :viewbox "0 0 34 34"},
                                               :tag     :symbol,
                                               :content ["\n"
                                                         {:type    :element,
                                                          :attrs   {:fill-rule "nonzero",
                                                                    :fill      "currentColor",
                                                                    :d         "M15.56 7.7L17 8.88l1.43-1.16c3.52-2.73 8.6-2.1 11.36 1.4 2.74 3.5 2.1 8.56-1.4 11.3L17 29 5.6 20.4c-3.5-2.73-4.13-7.8-1.4-11.3 2.76-3.5 7.84-4.13 11.36-1.4z"},
                                                          :tag     :path,
                                                          :content nil}
                                                         "\n"]}
                                              "\n\n"
                                              {:type    :element,
                                               :attrs   {:id "icon-favorite", :viewbox "0 0 30 30"},
                                               :tag     :symbol,
                                               :content ["\n"
                                                         {:type    :element,
                                                          :attrs   {:fill "none", :fill-rule "evenodd"},
                                                          :tag     :g,
                                                          :content ["\n"
                                                                    {:type    :element,
                                                                     :attrs   {:fill      "#FFF",
                                                                               :fill-rule "nonzero",
                                                                               :d         "M3.79 7.83c-2.068 2.638-1.6 6.44 1.022 8.482l.152.115c.17.13.17.13.428.323l1.528 1.152 4.637 3.498 3.44 2.596c.973-.732 2.128-1.603 3.432-2.587l4.652-3.512 1.526-1.153.556-.42c2.644-2.06 3.113-5.857 1.05-8.49-2.07-2.64-5.908-3.11-8.525-1.07l-2.695 2.18-2.678-2.17c-2.65-2.05-6.464-1.58-8.528 1.055zm9.77-2.622l1.436 1.164 1.435-1.16c3.517-2.74 8.61-2.117 11.357 1.39 2.748 3.505 2.122 8.562-1.394 11.302 0 0-7.592 5.735-11.397 8.596L3.608 17.91C.088 15.167-.535 10.105 2.215 6.596c2.75-3.51 7.826-4.126 11.345-1.39z"},
                                                                     :tag     :path,
                                                                     :content nil}
                                                                    "\n"
                                                                    {:type    :element,
                                                                     :attrs   {:class "hoverfill",
                                                                               :fill  "currentColor",
                                                                               :d     "M3.79 7.83c-2.068 2.638-1.6 6.44 1.022 8.482l.152.115c.17.13.17.13.428.323l1.528 1.152 4.637 3.498 3.44 2.596c.973-.732 2.128-1.603 3.432-2.587l4.652-3.512 1.526-1.153.556-.42c2.644-2.06 3.113-5.857 1.05-8.49-2.07-2.64-5.908-3.11-8.525-1.07l-2.695 2.18-2.678-2.17c-2.65-2.05-6.464-1.58-8.528 1.055z"},
                                                                     :tag     :path,
                                                                     :content nil}
                                                                    "\n"]}
                                                         "\n"]}
                                              "\n\n"]}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:style "display: none;"},
                                    :tag     :svg,
                                    :content ["\n"
                                              {:type    :element,
                                               :attrs   {:id "icon-arrow-down", :viewbox "0 0 16 10"},
                                               :tag     :symbol,
                                               :content ["\n"
                                                         {:type    :element,
                                                          :attrs   {:points          "2,2 8,8 14,2",
                                                                    :fill            "none",
                                                                    :stroke          "#07e",
                                                                    :stroke-width    "2",
                                                                    :stroke-linecap  "round",
                                                                    :stroke-linejoin "round"},
                                                          :tag     :polyline,
                                                          :content nil}
                                                         "\n"]}
                                              "\n\n"
                                              {:type    :element,
                                               :attrs   {:id "icon-arrow-left", :viewbox "0 0 10 16"},
                                               :tag     :symbol,
                                               :content ["\n"
                                                         {:type    :element,
                                                          :attrs   {:points          "8,2 2,8 8,14",
                                                                    :fill            "none",
                                                                    :stroke          "#07E",
                                                                    :stroke-width    "2",
                                                                    :stroke-linecap  "round",
                                                                    :stroke-linejoin "round"},
                                                          :tag     :polyline,
                                                          :content nil}
                                                         "\n"]}
                                              "\n\n"
                                              {:type    :element,
                                               :attrs   {:id "icon-arrow-right", :viewbox "0 0 10 16"},
                                               :tag     :symbol,
                                               :content ["\n"
                                                         {:type    :element,
                                                          :attrs   {:points          "2,2 8,8 2,14",
                                                                    :fill            "none",
                                                                    :stroke          "#07E",
                                                                    :stroke-width    "2",
                                                                    :stroke-linecap  "round",
                                                                    :stroke-linejoin "round"},
                                                          :tag     :polyline,
                                                          :content nil}
                                                         "\n"]}
                                              "\n\n"
                                              {:type    :element,
                                               :attrs   {:id "icon-checked", :viewbox "0 0 22 22"},
                                               :tag     :symbol,
                                               :content ["\n"
                                                         {:type    :element,
                                                          :attrs   {:fill "#04253C",
                                                                    :d    "M16.8 9.4l-6.1 6c-.378.376-1.02.38-1.4 0l-3.2-3.2c-.396-.396-.37-1.03 0-1.4.44-.44 1.007-.402 1.4 0 .887.908 2.5 2.5 2.5 2.5L15.4 8c.376-.377 1.002-.38 1.38 0 .47.47.397 1.022.02 1.4z"},
                                                          :tag     :path,
                                                          :content nil}
                                                         "\n"]}
                                              "\n\n"
                                              {:type    :element,
                                               :attrs   {:id "icon-checked-filled", :viewbox "0 0 22 22"},
                                               :tag     :symbol,
                                               :content ["\n"
                                                         {:type    :element,
                                                          :attrs   {:fill "#04253C",
                                                                    :d    "M11 .4C5.12.4.4 5.12.4 11S5.12 21.6 11 21.6 21.6 16.88 21.6 11 16.88.4 11 .4zm5.8 9l-6.1 6c-.378.376-1.02.38-1.4 0l-3.2-3.2c-.396-.396-.37-1.03 0-1.4.44-.44 1.007-.402 1.4 0 .887.908 2.5 2.5 2.5 2.5L15.4 8c.376-.377 1.002-.38 1.38 0 .47.47.397 1.022.02 1.4z"},
                                                          :tag     :path,
                                                          :content nil}
                                                         "\n"]}
                                              "\n\n"
                                              {:type    :element,
                                               :attrs   {:id "icon-add", :viewbox "0 0 22 22"},
                                               :tag     :symbol,
                                               :content ["\n"
                                                         {:type    :element,
                                                          :attrs   {:d "M15.8 10H12V6.2c0-.522-.417-1-1-1-.557 0-1 .478-1 1l.006 3.8H6.2c-.523 0-1 .474-1 1 0 .562.477 1 1 1H10v3.8c0 .523.5 1 1 1 .594 0 1-.477 1-1V12h3.8c.523 0 1-.387 1-1 0-.594-.477-1-1-1z"},
                                                          :tag     :path,
                                                          :content nil}
                                                         "\n"
                                                         {:type    :element,
                                                          :attrs   {:d "M11 .4C5.12.4.4 5.12.4 11S5.12 21.6 11 21.6 21.6 16.88 21.6 11 16.88.4 11 .4zm0 20.4c-5.426 0-9.8-4.375-9.8-9.8S5.574 1.2 11 1.2s9.8 4.375 9.8 9.8-4.374 9.8-9.8 9.8z"},
                                                          :tag     :path,
                                                          :content nil}
                                                         "\n"]}
                                              "\n\n"
                                              {:type    :element,
                                               :attrs   {:id "icon-subtract", :viewbox "0 0 22 22"},
                                               :tag     :symbol,
                                               :content ["\n"
                                                         {:type    :element,
                                                          :attrs   {:d "M15.8 10H6.2c-.523 0-1 .474-1 1 0 .562.477 1 1 1h9.6c.523 0 1-.387 1-1 0-.594-.477-1-1-1z"},
                                                          :tag     :path,
                                                          :content nil}
                                                         "\n"
                                                         {:type    :element,
                                                          :attrs   {:d "M11 .4C5.12.4.4 5.12.4 11S5.12 21.6 11 21.6 21.6 16.88 21.6 11 16.88.4 11 .4zm0 20.4c-5.426 0-9.8-4.375-9.8-9.8S5.574 1.2 11 1.2s9.8 4.375 9.8 9.8-4.374 9.8-9.8 9.8z"},
                                                          :tag     :path,
                                                          :content nil}
                                                         "\n"]}
                                              "\n\n"
                                              {:type    :element,
                                               :attrs   {:id "icon-cross", :viewbox "0 0 22 22"},
                                               :tag     :symbol,
                                               :content ["\n"
                                                         {:type    :element,
                                                          :attrs   {:fill "#04253C",
                                                                    :d    "M15.3 15.3c-.45.45-1.116.385-1.5 0L11 12.5l-2.8 2.8c-.385.385-1.063.437-1.5 0-.367-.367-.385-1.114 0-1.5L9.5 11 6.7 8.2c-.385-.385-.414-1.086 0-1.5.387-.387 1.115-.384 1.5 0L11 9.5l2.8-2.8c.384-.385 1.09-.408 1.5 0 .428.43.384 1.115 0 1.5L12.5 11l2.8 2.8c.385.386.435 1.064 0 1.5z"},
                                                          :tag     :path,
                                                          :content nil}
                                                         "\n"]}
                                              "\n\n"
                                              {:type    :element,
                                               :attrs   {:id "icon-cross-filled", :viewbox "0 0 22 22"},
                                               :tag     :symbol,
                                               :content ["\n"
                                                         {:type    :element,
                                                          :attrs   {:fill "#04253C",
                                                                    :d    "M11 .4C5.12.4.4 5.12.4 11S5.12 21.6 11 21.6 21.6 16.88 21.6 11 16.88.4 11 .4zm4.3 14.9c-.45.45-1.116.385-1.5 0L11 12.5l-2.8 2.8c-.385.385-1.063.437-1.5 0-.367-.367-.385-1.114 0-1.5L9.5 11 6.7 8.2c-.385-.385-.414-1.086 0-1.5.387-.387 1.115-.384 1.5 0L11 9.5l2.8-2.8c.384-.385 1.09-.408 1.5 0 .428.43.384 1.115 0 1.5L12.5 11l2.8 2.8c.385.386.435 1.064 0 1.5z"},
                                                          :tag     :path,
                                                          :content nil}
                                                         "\n"]}
                                              "\n\n"
                                              {:type    :element,
                                               :attrs   {:id "icon-calendar", :viewbox "0 0 22 22"},
                                               :tag     :symbol,
                                               :content ["\n"
                                                         {:type    :element,
                                                          :attrs   {:fill "currentColor"},
                                                          :tag     :g,
                                                          :content ["\n"
                                                                    {:type    :element,
                                                                     :attrs   {:d "M13 13h3v3h-3z"},
                                                                     :tag     :path,
                                                                     :content nil}
                                                                    "\n"
                                                                    {:type    :element,
                                                                     :attrs   {:d "M18 4h-1V2h-2v2H7V2H5v2H4c-1.102 0-2 .9-2 2v12c0 1.1.898 2 2 2h14c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 14H4V9h14v9z"},
                                                                     :tag     :path,
                                                                     :content nil}
                                                                    "\n"]}
                                                         "\n"]}
                                              "\n\n"
                                              {:type    :element,
                                               :attrs   {:id "icon-external", :viewbox "0 0 22 22"},
                                               :tag     :symbol,
                                               :content ["\n"
                                                         {:type    :element,
                                                          :attrs   {:fill "#CDD3D8"},
                                                          :tag     :g,
                                                          :content ["\n"
                                                                    {:type    :element,
                                                                     :attrs   {:d "M14 14.8V17H5V8h2.2l2-2H5c-1.312 0-2 .75-2 2.016V17c0 1.25.734 2 1.983 2h9c1.25 0 2.017-.78 2.017-1.984V12.8l-2 2z"},
                                                                     :tag     :path,
                                                                     :content nil}
                                                                    "\n"
                                                                    {:type    :element,
                                                                     :attrs   {:d "M19 3h-9l2.5 2.5-4.395 4.437 3.967 3.97L16.5 9.5 19 12"},
                                                                     :tag     :path,
                                                                     :content nil}
                                                                    "\n"]}
                                                         "\n"]}
                                              "\n\n"
                                              {:type    :element,
                                               :attrs   {:id "icon-verified-user", :viewbox "0 0 18 18"},
                                               :tag     :symbol,
                                               :content ["\n"
                                                         {:type    :element,
                                                          :attrs   {:fill "#0063FB",
                                                                    :d    "M3 4.545L9 2l6 2.545C15 9 15 14.091 9 16 3 14.09 3 9 3 4.545z"},
                                                          :tag     :path,
                                                          :content nil}
                                                         "\n"
                                                         {:type    :element,
                                                          :attrs   {:fill      "#FFF",
                                                                    :fill-rule "nonzero",
                                                                    :d         "M6.877 7.417L5.5 8.771 8.276 11.5 12.5 7.354 11.125 6 8.277 8.794z"},
                                                          :tag     :path,
                                                          :content nil}
                                                         "\n"]}
                                              "\n\n"
                                              {:type    :element,
                                               :attrs   {:id "icon-my-location", :viewbox "0 2 22 22"},
                                               :tag     :symbol,
                                               :content ["\n"
                                                         {:type    :element,
                                                          :attrs   {:fill "currentColor",
                                                                    :d    "M16.8 8.5c0-2.91-2.618-5.3-5.8-5.3-3.18 0-5.8 2.412-5.8 5.3 0 5.325 5.8 11.1 5.8 11.1s5.8-5.665 5.8-11.1zM11 11.9c-1.575 0-2.9-1.325-2.9-2.9S9.425 6.1 11 6.1s2.9 1.325 2.9 2.9-1.325 2.9-2.9 2.9z"},
                                                          :tag     :path,
                                                          :content nil}
                                                         "\n"]}
                                              "\n\n"
                                              {:type    :element,
                                               :attrs   {:id "icon-remove", :width "30", :height "30", :viewbox "0 0 30 30"},
                                               :tag     :symbol,
                                               :content ["\n"
                                                         {:type    :element,
                                                          :attrs   {:fill "none", :fill-rule "evenodd"},
                                                          :tag     :g,
                                                          :content ["\n"
                                                                    {:type    :element,
                                                                     :attrs   {:fill "currentColor",
                                                                               :d    "M15 24c-4.97 0-9-4.03-9-9s4.03-9 9-9 9 4.03 9 9-4.03 9-9 9zm0-10.43L11.43 10 10 11.43 13.57 15 10 18.57 11.43 20 15 16.43 18.57 20 20 18.57 16.43 15 20 11.43 18.57 10 15 13.57z"},
                                                                     :tag     :path,
                                                                     :content nil}
                                                                    "\n"
                                                                    {:type    :element,
                                                                     :attrs   {:fill-opacity ".3",
                                                                               :fill         "#FFF",
                                                                               :fill-rule    "nonzero",
                                                                               :d            "M15 24c4.97 0 9-4.03 9-9s-4.03-9-9-9-9 4.03-9 9 4.03 9 9 9zm0 2C8.925 26 4 21.075 4 15S8.925 4 15 4s11 4.925 11 11-4.925 11-11 11z"},
                                                                     :tag     :path,
                                                                     :content nil}
                                                                    "\n"
                                                                    {:type    :element,
                                                                     :attrs   {:fill-opacity ".3",
                                                                               :fill         "#FFF",
                                                                               :fill-rule    "nonzero",
                                                                               :d            "M15 13.57L18.57 10 20 11.43 16.43 15 20 18.57 18.57 20 15 16.43 11.43 20 10 18.57 13.57 15 10 11.43 11.43 10 15 13.57"},
                                                                     :tag     :path,
                                                                     :content nil}
                                                                    "\n"]}
                                                         "\n"]}
                                              "\n\n"
                                              {:type    :element,
                                               :attrs   {:id "icon-paper-plane", :viewbox "0 0 29 29"},
                                               :tag     :symbol,
                                               :content ["\n"
                                                         {:type    :element,
                                                          :attrs   {:fill      "currentColor",
                                                                    :fill-rule "evenodd",
                                                                    :d         "M27 14.5L2 27V16.7l10.8-2.2L2 12.3V2"},
                                                          :tag     :path,
                                                          :content nil}
                                                         "\n"]}
                                              "\n"]}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:class "container  bg-ice pbs"},
                                    :tag     :div,
                                    :content ["\n"
                                              {:type    :element,
                                               :attrs   {:class "page"},
                                               :tag     :div,
                                               :content ["\n                        \n\n"
                                                         {:type    :element,
                                                          :attrs   {:style "display: none;"},
                                                          :tag     :svg,
                                                          :content ["\n"
                                                                    {:type    :element,
                                                                     :attrs   {:id "icon-arrow-down", :viewbox "0 0 16 10"},
                                                                     :tag     :symbol,
                                                                     :content ["\n"
                                                                               {:type    :element,
                                                                                :attrs   {:points          "2,2 8,8 14,2",
                                                                                          :fill            "none",
                                                                                          :stroke          "#07e",
                                                                                          :stroke-width    "2",
                                                                                          :stroke-linecap  "round",
                                                                                          :stroke-linejoin "round"},
                                                                                :tag     :polyline,
                                                                                :content nil}
                                                                               "\n"]}
                                                                    "\n\n"
                                                                    {:type    :element,
                                                                     :attrs   {:id "icon-arrow-left", :viewbox "0 0 10 16"},
                                                                     :tag     :symbol,
                                                                     :content ["\n"
                                                                               {:type    :element,
                                                                                :attrs   {:points          "8,2 2,8 8,14",
                                                                                          :fill            "none",
                                                                                          :stroke          "#07E",
                                                                                          :stroke-width    "2",
                                                                                          :stroke-linecap  "round",
                                                                                          :stroke-linejoin "round"},
                                                                                :tag     :polyline,
                                                                                :content nil}
                                                                               "\n"]}
                                                                    "\n\n"
                                                                    {:type    :element,
                                                                     :attrs   {:id "icon-arrow-right", :viewbox "0 0 10 16"},
                                                                     :tag     :symbol,
                                                                     :content ["\n"
                                                                               {:type    :element,
                                                                                :attrs   {:points          "2,2 8,8 2,14",
                                                                                          :fill            "none",
                                                                                          :stroke          "#07E",
                                                                                          :stroke-width    "2",
                                                                                          :stroke-linecap  "round",
                                                                                          :stroke-linejoin "round"},
                                                                                :tag     :polyline,
                                                                                :content nil}
                                                                               "\n"]}
                                                                    "\n\n"
                                                                    {:type    :element,
                                                                     :attrs   {:id "icon-checked", :viewbox "0 0 22 22"},
                                                                     :tag     :symbol,
                                                                     :content ["\n"
                                                                               {:type    :element,
                                                                                :attrs   {:fill "#04253C",
                                                                                          :d    "M16.8 9.4l-6.1 6c-.378.376-1.02.38-1.4 0l-3.2-3.2c-.396-.396-.37-1.03 0-1.4.44-.44 1.007-.402 1.4 0 .887.908 2.5 2.5 2.5 2.5L15.4 8c.376-.377 1.002-.38 1.38 0 .47.47.397 1.022.02 1.4z"},
                                                                                :tag     :path,
                                                                                :content nil}
                                                                               "\n"]}
                                                                    "\n\n"
                                                                    {:type    :element,
                                                                     :attrs   {:id      "icon-checked-filled",
                                                                               :viewbox "0 0 22 22"},
                                                                     :tag     :symbol,
                                                                     :content ["\n"
                                                                               {:type    :element,
                                                                                :attrs   {:fill "#04253C",
                                                                                          :d    "M11 .4C5.12.4.4 5.12.4 11S5.12 21.6 11 21.6 21.6 16.88 21.6 11 16.88.4 11 .4zm5.8 9l-6.1 6c-.378.376-1.02.38-1.4 0l-3.2-3.2c-.396-.396-.37-1.03 0-1.4.44-.44 1.007-.402 1.4 0 .887.908 2.5 2.5 2.5 2.5L15.4 8c.376-.377 1.002-.38 1.38 0 .47.47.397 1.022.02 1.4z"},
                                                                                :tag     :path,
                                                                                :content nil}
                                                                               "\n"]}
                                                                    "\n\n"
                                                                    {:type    :element,
                                                                     :attrs   {:id "icon-add", :viewbox "0 0 22 22"},
                                                                     :tag     :symbol,
                                                                     :content ["\n"
                                                                               {:type    :element,
                                                                                :attrs   {:d "M15.8 10H12V6.2c0-.522-.417-1-1-1-.557 0-1 .478-1 1l.006 3.8H6.2c-.523 0-1 .474-1 1 0 .562.477 1 1 1H10v3.8c0 .523.5 1 1 1 .594 0 1-.477 1-1V12h3.8c.523 0 1-.387 1-1 0-.594-.477-1-1-1z"},
                                                                                :tag     :path,
                                                                                :content nil}
                                                                               "\n"
                                                                               {:type    :element,
                                                                                :attrs   {:d "M11 .4C5.12.4.4 5.12.4 11S5.12 21.6 11 21.6 21.6 16.88 21.6 11 16.88.4 11 .4zm0 20.4c-5.426 0-9.8-4.375-9.8-9.8S5.574 1.2 11 1.2s9.8 4.375 9.8 9.8-4.374 9.8-9.8 9.8z"},
                                                                                :tag     :path,
                                                                                :content nil}
                                                                               "\n"]}
                                                                    "\n\n"
                                                                    {:type    :element,
                                                                     :attrs   {:id "icon-subtract", :viewbox "0 0 22 22"},
                                                                     :tag     :symbol,
                                                                     :content ["\n"
                                                                               {:type    :element,
                                                                                :attrs   {:d "M15.8 10H6.2c-.523 0-1 .474-1 1 0 .562.477 1 1 1h9.6c.523 0 1-.387 1-1 0-.594-.477-1-1-1z"},
                                                                                :tag     :path,
                                                                                :content nil}
                                                                               "\n"
                                                                               {:type    :element,
                                                                                :attrs   {:d "M11 .4C5.12.4.4 5.12.4 11S5.12 21.6 11 21.6 21.6 16.88 21.6 11 16.88.4 11 .4zm0 20.4c-5.426 0-9.8-4.375-9.8-9.8S5.574 1.2 11 1.2s9.8 4.375 9.8 9.8-4.374 9.8-9.8 9.8z"},
                                                                                :tag     :path,
                                                                                :content nil}
                                                                               "\n"]}
                                                                    "\n\n"
                                                                    {:type    :element,
                                                                     :attrs   {:id "icon-cross", :viewbox "0 0 22 22"},
                                                                     :tag     :symbol,
                                                                     :content ["\n"
                                                                               {:type    :element,
                                                                                :attrs   {:fill "#04253C",
                                                                                          :d    "M15.3 15.3c-.45.45-1.116.385-1.5 0L11 12.5l-2.8 2.8c-.385.385-1.063.437-1.5 0-.367-.367-.385-1.114 0-1.5L9.5 11 6.7 8.2c-.385-.385-.414-1.086 0-1.5.387-.387 1.115-.384 1.5 0L11 9.5l2.8-2.8c.384-.385 1.09-.408 1.5 0 .428.43.384 1.115 0 1.5L12.5 11l2.8 2.8c.385.386.435 1.064 0 1.5z"},
                                                                                :tag     :path,
                                                                                :content nil}
                                                                               "\n"]}
                                                                    "\n\n"
                                                                    {:type    :element,
                                                                     :attrs   {:id      "icon-cross-filled",
                                                                               :viewbox "0 0 22 22"},
                                                                     :tag     :symbol,
                                                                     :content ["\n"
                                                                               {:type    :element,
                                                                                :attrs   {:fill "#04253C",
                                                                                          :d    "M11 .4C5.12.4.4 5.12.4 11S5.12 21.6 11 21.6 21.6 16.88 21.6 11 16.88.4 11 .4zm4.3 14.9c-.45.45-1.116.385-1.5 0L11 12.5l-2.8 2.8c-.385.385-1.063.437-1.5 0-.367-.367-.385-1.114 0-1.5L9.5 11 6.7 8.2c-.385-.385-.414-1.086 0-1.5.387-.387 1.115-.384 1.5 0L11 9.5l2.8-2.8c.384-.385 1.09-.408 1.5 0 .428.43.384 1.115 0 1.5L12.5 11l2.8 2.8c.385.386.435 1.064 0 1.5z"},
                                                                                :tag     :path,
                                                                                :content nil}
                                                                               "\n"]}
                                                                    "\n\n"
                                                                    {:type    :element,
                                                                     :attrs   {:id "icon-calendar", :viewbox "0 0 22 22"},
                                                                     :tag     :symbol,
                                                                     :content ["\n"
                                                                               {:type    :element,
                                                                                :attrs   {:fill "currentColor"},
                                                                                :tag     :g,
                                                                                :content ["\n"
                                                                                          {:type    :element,
                                                                                           :attrs   {:d "M13 13h3v3h-3z"},
                                                                                           :tag     :path,
                                                                                           :content nil}
                                                                                          "\n"
                                                                                          {:type    :element,
                                                                                           :attrs   {:d "M18 4h-1V2h-2v2H7V2H5v2H4c-1.102 0-2 .9-2 2v12c0 1.1.898 2 2 2h14c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 14H4V9h14v9z"},
                                                                                           :tag     :path,
                                                                                           :content nil}
                                                                                          "\n"]}
                                                                               "\n"]}
                                                                    "\n\n"
                                                                    {:type    :element,
                                                                     :attrs   {:id "icon-external", :viewbox "0 0 22 22"},
                                                                     :tag     :symbol,
                                                                     :content ["\n"
                                                                               {:type    :element,
                                                                                :attrs   {:fill "#CDD3D8"},
                                                                                :tag     :g,
                                                                                :content ["\n"
                                                                                          {:type    :element,
                                                                                           :attrs   {:d "M14 14.8V17H5V8h2.2l2-2H5c-1.312 0-2 .75-2 2.016V17c0 1.25.734 2 1.983 2h9c1.25 0 2.017-.78 2.017-1.984V12.8l-2 2z"},
                                                                                           :tag     :path,
                                                                                           :content nil}
                                                                                          "\n"
                                                                                          {:type    :element,
                                                                                           :attrs   {:d "M19 3h-9l2.5 2.5-4.395 4.437 3.967 3.97L16.5 9.5 19 12"},
                                                                                           :tag     :path,
                                                                                           :content nil}
                                                                                          "\n"]}
                                                                               "\n"]}
                                                                    "\n\n"
                                                                    {:type    :element,
                                                                     :attrs   {:id      "icon-verified-user",
                                                                               :viewbox "0 0 18 18"},
                                                                     :tag     :symbol,
                                                                     :content ["\n"
                                                                               {:type    :element,
                                                                                :attrs   {:fill "#0063FB",
                                                                                          :d    "M3 4.545L9 2l6 2.545C15 9 15 14.091 9 16 3 14.09 3 9 3 4.545z"},
                                                                                :tag     :path,
                                                                                :content nil}
                                                                               "\n"
                                                                               {:type    :element,
                                                                                :attrs   {:fill      "#FFF",
                                                                                          :fill-rule "nonzero",
                                                                                          :d         "M6.877 7.417L5.5 8.771 8.276 11.5 12.5 7.354 11.125 6 8.277 8.794z"},
                                                                                :tag     :path,
                                                                                :content nil}
                                                                               "\n"]}
                                                                    "\n\n"
                                                                    {:type    :element,
                                                                     :attrs   {:id "icon-my-location", :viewbox "0 2 22 22"},
                                                                     :tag     :symbol,
                                                                     :content ["\n"
                                                                               {:type    :element,
                                                                                :attrs   {:fill "currentColor",
                                                                                          :d    "M16.8 8.5c0-2.91-2.618-5.3-5.8-5.3-3.18 0-5.8 2.412-5.8 5.3 0 5.325 5.8 11.1 5.8 11.1s5.8-5.665 5.8-11.1zM11 11.9c-1.575 0-2.9-1.325-2.9-2.9S9.425 6.1 11 6.1s2.9 1.325 2.9 2.9-1.325 2.9-2.9 2.9z"},
                                                                                :tag     :path,
                                                                                :content nil}
                                                                               "\n"]}
                                                                    "\n\n"
                                                                    {:type    :element,
                                                                     :attrs   {:id      "icon-remove",
                                                                               :width   "30",
                                                                               :height  "30",
                                                                               :viewbox "0 0 30 30"},
                                                                     :tag     :symbol,
                                                                     :content ["\n"
                                                                               {:type    :element,
                                                                                :attrs   {:fill      "none",
                                                                                          :fill-rule "evenodd"},
                                                                                :tag     :g,
                                                                                :content ["\n"
                                                                                          {:type    :element,
                                                                                           :attrs   {:fill "currentColor",
                                                                                                     :d    "M15 24c-4.97 0-9-4.03-9-9s4.03-9 9-9 9 4.03 9 9-4.03 9-9 9zm0-10.43L11.43 10 10 11.43 13.57 15 10 18.57 11.43 20 15 16.43 18.57 20 20 18.57 16.43 15 20 11.43 18.57 10 15 13.57z"},
                                                                                           :tag     :path,
                                                                                           :content nil}
                                                                                          "\n"
                                                                                          {:type    :element,
                                                                                           :attrs   {:fill-opacity ".3",
                                                                                                     :fill         "#FFF",
                                                                                                     :fill-rule    "nonzero",
                                                                                                     :d            "M15 24c4.97 0 9-4.03 9-9s-4.03-9-9-9-9 4.03-9 9 4.03 9 9 9zm0 2C8.925 26 4 21.075 4 15S8.925 4 15 4s11 4.925 11 11-4.925 11-11 11z"},
                                                                                           :tag     :path,
                                                                                           :content nil}
                                                                                          "\n"
                                                                                          {:type    :element,
                                                                                           :attrs   {:fill-opacity ".3",
                                                                                                     :fill         "#FFF",
                                                                                                     :fill-rule    "nonzero",
                                                                                                     :d            "M15 13.57L18.57 10 20 11.43 16.43 15 20 18.57 18.57 20 15 16.43 11.43 20 10 18.57 13.57 15 10 11.43 11.43 10 15 13.57"},
                                                                                           :tag     :path,
                                                                                           :content nil}
                                                                                          "\n"]}
                                                                               "\n"]}
                                                                    "\n\n"
                                                                    {:type    :element,
                                                                     :attrs   {:id "icon-paper-plane", :viewbox "0 0 29 29"},
                                                                     :tag     :symbol,
                                                                     :content ["\n"
                                                                               {:type    :element,
                                                                                :attrs   {:fill      "currentColor",
                                                                                          :fill-rule "evenodd",
                                                                                          :d         "M27 14.5L2 27V16.7l10.8-2.2L2 12.3V2"},
                                                                                :tag     :path,
                                                                                :content nil}
                                                                               "\n"]}
                                                                    "\n"]}
                                                         "\n"
                                                         {:type    :element,
                                                          :attrs   {:class "mod shadow listing"},
                                                          :tag     :div,
                                                          :content ["\n"
                                                                    {:type    :element,
                                                                     :attrs   {:class "inner pvn"},
                                                                     :tag     :div,
                                                                     :content ["\n"
                                                                               {:type    :element,
                                                                                :attrs   {:class "bd flex ptm"},
                                                                                :tag     :div,
                                                                                :content ["\n"
                                                                                          {:type    :element,
                                                                                           :attrs   {:class "flex-grow1 truncate mrl flex"},
                                                                                           :tag     :div,
                                                                                           :content ["\n    \n"
                                                                                                     {:type    :element,
                                                                                                      :attrs   {:aria-label "Brodsmuler"},
                                                                                                      :tag     :nav,
                                                                                                      :content ["\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   {:class "breadcrumbs",
                                                                                                                           :role  "presentation"},
                                                                                                                 :tag     :ul,
                                                                                                                 :content ["
                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   nil,
                                                                                                                            :tag     :li,
                                                                                                                            :content [{:type    :element,
                                                                                                                                       :attrs   {:href            "https://www.finn.no/job/browse.html",
                                                                                                                                                 :data-controller "trackCrumbTrailMarket",
                                                                                                                                                 :class           "truncate"},
                                                                                                                                       :tag     :a,
                                                                                                                                       :content ["Jobb"]}]}
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   nil,
                                                                                                                            :tag     :li,
                                                                                                                            :content [{:type    :element,
                                                                                                                                       :attrs   {:href            "https://www.finn.no/job/fulltime/search.html",
                                                                                                                                                 :data-controller "trackCrumbTrailVertical",
                                                                                                                                                 :class           "truncate"},
                                                                                                                                       :tag     :a,
                                                                                                                                       :content ["Alle stillinger"]}]}
                                                                                                                           "
                                                                                                                                          "]}
                                                                                                                "\n"]}
                                                                                                     "\n"]}
                                                                                          "\n\n"
                                                                                          {:type    :element,
                                                                                           :attrs   {:class "flex-no-shrink"},
                                                                                           :tag     :div,
                                                                                           :content ["\n"
                                                                                                     {:type    :element,
                                                                                                      :attrs   {:data-controller "adPaging",
                                                                                                                :class           "u-display-none hidden inlineblockify no-break noprint"},
                                                                                                      :tag     :span,
                                                                                                      :content ["\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   {:rel             "prev",
                                                                                                                           :class           "pvl phm",
                                                                                                                           :data-controller "trackAdPagingPrev",
                                                                                                                           :aria-label      "Forrige annonse",
                                                                                                                           :accesskey       "f"},
                                                                                                                 :tag     :a,
                                                                                                                 :content [{:type    :element,
                                                                                                                            :attrs   {:class   "valign-middle",
                                                                                                                                      :viewbox "0 0 10 20",
                                                                                                                                      :width   "10",
                                                                                                                                      :height  "20"},
                                                                                                                            :tag     :svg,
                                                                                                                            :content [{:type    :element,
                                                                                                                                       :attrs   {:fill            "none",
                                                                                                                                                 :stroke          "#07E",
                                                                                                                                                 :stroke-width    "2",
                                                                                                                                                 :stroke-linecap  "round",
                                                                                                                                                 :stroke-linejoin "round",
                                                                                                                                                 :d               "M9 1l-8 9 8 9"},
                                                                                                                                       :tag     :path,
                                                                                                                                       :content nil}]}
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:class "valign-middle mlm hide-lt768 accesskey inlineblockify"},
                                                                                                                            :tag     :span,
                                                                                                                            :content ["Forrige"]}]}
                                                                                                                "\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   {:rel        "start",
                                                                                                                           :class      "pvl phm",
                                                                                                                           :aria-label "Til soket",
                                                                                                                           :accesskey  "s"},
                                                                                                                 :tag     :a,
                                                                                                                 :content [{:type    :element,
                                                                                                                            :attrs   {:class   "valign-middle",
                                                                                                                                      :viewbox "0 0 20 20",
                                                                                                                                      :width   "20",
                                                                                                                                      :height  "20"},
                                                                                                                            :tag     :svg,
                                                                                                                            :content [{:type    :element,
                                                                                                                                       :attrs   {:fill "#07e",
                                                                                                                                                 :d    "M4 4h14v2H4zM4 8h14v2H4zM4 12h14v2H4zM4 16h14v2H4z"},
                                                                                                                                       :tag     :path,
                                                                                                                                       :content nil}]}
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:class "valign-middle mlm hide-lt768"},
                                                                                                                            :tag     :span,
                                                                                                                            :content ["Til "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   {:class "accesskey inlineblockify"},
                                                                                                                                       :tag     :span,
                                                                                                                                       :content ["soket"]}]}]}
                                                                                                                "\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   {:rel             "next",
                                                                                                                           :class           "pvl plm",
                                                                                                                           :data-controller "trackAdPagingNext",
                                                                                                                           :aria-label      "Neste annonse",
                                                                                                                           :accesskey       "n"},
                                                                                                                 :tag     :a,
                                                                                                                 :content [{:type    :element,
                                                                                                                            :attrs   {:class "valign-middle mrm hide-lt768 accesskey inlineblockify"},
                                                                                                                            :tag     :span,
                                                                                                                            :content ["Neste"]}
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:class   "valign-middle",
                                                                                                                                      :viewbox "0 0 10 20",
                                                                                                                                      :width   "10",
                                                                                                                                      :height  "20"},
                                                                                                                            :tag     :svg,
                                                                                                                            :content [{:type    :element,
                                                                                                                                       :attrs   {:fill            "none",
                                                                                                                                                 :stroke          "#07e",
                                                                                                                                                 :stroke-width    "2",
                                                                                                                                                 :stroke-linecap  "round",
                                                                                                                                                 :stroke-linejoin "round",
                                                                                                                                                 :d               "M1 1l8 9-8 9"},
                                                                                                                                       :tag     :path,
                                                                                                                                       :content nil}]}]}
                                                                                                                "\n"]}
                                                                                                     "\n"]}
                                                                                          "\n"]}
                                                                               "\n\n"]}
                                                                    "\n"]}
                                                         "\n"
                                                         {:type    :element,
                                                          :attrs   {:class "visuallyhidden", :id "ad-start-link"},
                                                          :tag     :div,
                                                          :content nil}
                                                         "\n"
                                                         {:type    :element,
                                                          :attrs   {:class "line"},
                                                          :tag     :div,
                                                          :content ["\n"
                                                                    {:type    :element,
                                                                     :attrs   {:class "unit r-size2of3"},
                                                                     :tag     :div,
                                                                     :content ["\n\n"
                                                                               {:type    :element,
                                                                                :attrs   {:class           "mod shadow",
                                                                                          :data-controller "storeVisitedAd trackAd"},
                                                                                :tag     :div,
                                                                                :content ["\n"
                                                                                          {:type    :element,
                                                                                           :attrs   {:class "inner ribbon2 ptn"},
                                                                                           :tag     :div,
                                                                                           :content ["\n"
                                                                                                     {:type    :element,
                                                                                                      :attrs   {:class "bd word-break"},
                                                                                                      :tag     :div,
                                                                                                      :content ["\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   {:class "company-logo-container hide-ht768 noprint"},
                                                                                                                 :tag     :div,
                                                                                                                 :content ["
                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:class "centered-element pvl company-logo",
                                                                                                                                      :src   "https://images.finncdn.no/dynamic/1600w/logo/object/973223138/iad_1370121060756140715logo_centric_l_fc.png",
                                                                                                                                      :alt   "Centric IT Professionals AS"},
                                                                                                                            :tag     :img,
                                                                                                                            :content nil}
                                                                                                                           "
                                                                                                                                          "]}
                                                                                                                "\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   {:class           "toolbar noprint",
                                                                                                                           :data-controller "itemFavoriteToggle"},
                                                                                                                 :tag     :div,
                                                                                                                 :content ["
                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:class "unoverflowify r-margin"},
                                                                                                                            :tag     :div,
                                                                                                                            :content ["
                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   {:title                   "Lagre i favorittliste",
                                                                                                                                                 :aria-label              "Lagre i favorittliste",
                                                                                                                                                 :class                   "fleft pvs prs pln licorice blank b1",
                                                                                                                                                 :data-show-favorite-list "",
                                                                                                                                                 :data-heart-ad-id        "130001312"},
                                                                                                                                       :tag     :button,
                                                                                                                                       :content ["
                                                                                                                                                "
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :div,
                                                                                                                                                  :content ["
                                                                                                                                                           "
                                                                                                                                                            {:type    :element,
                                                                                                                                                             :attrs   {:width  "34",
                                                                                                                                                                       :height "34",
                                                                                                                                                                       :class  "valign-middle"},
                                                                                                                                                             :tag     :svg,
                                                                                                                                                             :content ["
                                                                                                                                                                      "
                                                                                                                                                                       {:type    :element,
                                                                                                                                                                        :attrs   nil,
                                                                                                                                                                        :tag     :title,
                                                                                                                                                                        :content ["Vis favorittlister"]}
                                                                                                                                                                       "
                                                                                                                                                                                      "
                                                                                                                                                                       {:type    :element,
                                                                                                                                                                        :attrs   {:xlink:href "#icon-share-favorite-empty",
                                                                                                                                                                                  :class      "licorice"},
                                                                                                                                                                        :tag     :use,
                                                                                                                                                                        :content nil}
                                                                                                                                                                       "
                                                                                                                                                                                      "]}
                                                                                                                                                            "
                                                                                                                                                                           "
                                                                                                                                                            {:type    :element,
                                                                                                                                                             :attrs   {:class "hide-lt600"},
                                                                                                                                                             :tag     :span,
                                                                                                                                                             :content ["Lagre annonsen"]}
                                                                                                                                                            "
                                                                                                                                                                           "]}
                                                                                                                                                 "
                                                                                                                                                                "]}
                                                                                                                                      "

                                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   {:class           "fleft pas",
                                                                                                                                                 :title           "Tips en venn",
                                                                                                                                                 :role            "button",
                                                                                                                                                 :href            "#",
                                                                                                                                                 :data-controller "trackShareTipAFriend toggleContent",
                                                                                                                                                 :data-select     "data-tip-a-friend-form"},
                                                                                                                                       :tag     :a,
                                                                                                                                       :content ["
                                                                                                                                                "
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   {:width  "34",
                                                                                                                                                            :height "34",
                                                                                                                                                            :class  "blockify"},
                                                                                                                                                  :tag     :svg,
                                                                                                                                                  :content ["
                                                                                                                                                           "
                                                                                                                                                            {:type    :element,
                                                                                                                                                             :attrs   nil,
                                                                                                                                                             :tag     :title,
                                                                                                                                                             :content ["Tips en venn"]}
                                                                                                                                                            "
                                                                                                                                                                           "
                                                                                                                                                            {:type    :element,
                                                                                                                                                             :attrs   {:xlink:href "#icon-share-email"},
                                                                                                                                                             :tag     :use,
                                                                                                                                                             :content nil}
                                                                                                                                                            "
                                                                                                                                                                           "]}
                                                                                                                                                 "
                                                                                                                                                                "]}
                                                                                                                                      "
                                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   {:aria-owns "tip-a-friend-form"},
                                                                                                                                       :tag     :span,
                                                                                                                                       :content nil}
                                                                                                                                      "

                                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   {:title           "Del paa Facebook",
                                                                                                                                                 :class           "fleft pas",
                                                                                                                                                 :role            "link",
                                                                                                                                                 :href            "https://www.facebook.com/sharer/sharer.php?u=https://www.finn.no/130001312?taid%3DShare_ad_facebook",
                                                                                                                                                 :data-controller "trackShareOnFacebook",
                                                                                                                                                 :rel             "external",
                                                                                                                                                 :target          "_blank"},
                                                                                                                                       :tag     :a,
                                                                                                                                       :content ["
                                                                                                                                                "
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   {:width  "34",
                                                                                                                                                            :height "34",
                                                                                                                                                            :class  "blockify"},
                                                                                                                                                  :tag     :svg,
                                                                                                                                                  :content ["
                                                                                                                                                           "
                                                                                                                                                            {:type    :element,
                                                                                                                                                             :attrs   nil,
                                                                                                                                                             :tag     :title,
                                                                                                                                                             :content ["Del paa Facebook"]}
                                                                                                                                                            "
                                                                                                                                                                           "
                                                                                                                                                            {:type    :element,
                                                                                                                                                             :attrs   {:xlink:href "#icon-share-facebook"},
                                                                                                                                                             :tag     :use,
                                                                                                                                                             :content nil}
                                                                                                                                                            "
                                                                                                                                                                           "]}
                                                                                                                                                 "
                                                                                                                                                                "]}
                                                                                                                                      "

                                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   {:title           "Del paa Twitter",
                                                                                                                                                 :class           "fleft pas",
                                                                                                                                                 :role            "link",
                                                                                                                                                 :href            "https://twitter.com/intent/tweet?hashtags=FINN_no&related=Finn_no&url=https://www.finn.no/130001312?taid%3DShare_ad_twitter&text=%C3%98nsker%20du%20%C3%A5%20jobbe%20med%20leveranser/integrasjoner%20%20i%20et%20spennende%20selskap?",
                                                                                                                                                 :data-controller "trackShareOnFacebook",
                                                                                                                                                 :rel             "external",
                                                                                                                                                 :target          "_blank"},
                                                                                                                                       :tag     :a,
                                                                                                                                       :content ["
                                                                                                                                                "
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   {:width  "34",
                                                                                                                                                            :height "34",
                                                                                                                                                            :class  "blockify"},
                                                                                                                                                  :tag     :svg,
                                                                                                                                                  :content ["
                                                                                                                                                           "
                                                                                                                                                            {:type    :element,
                                                                                                                                                             :attrs   nil,
                                                                                                                                                             :tag     :title,
                                                                                                                                                             :content ["Del paa Twitter"]}
                                                                                                                                                            "
                                                                                                                                                                           "
                                                                                                                                                            {:type    :element,
                                                                                                                                                             :attrs   {:xlink:href "#icon-share-twitter"},
                                                                                                                                                             :tag     :use,
                                                                                                                                                             :content nil}
                                                                                                                                                            "
                                                                                                                                                                           "]}
                                                                                                                                                 "
                                                                                                                                                                "]}
                                                                                                                                      "
                                                                                                                                                     "]}
                                                                                                                           "
                                                                                                                                          "]}
                                                                                                                "\n\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   {:id                     "tip-a-friend-form",
                                                                                                                           :class                  "sendform hidden",
                                                                                                                           :data-controller        "tipafriend",
                                                                                                                           :data-tip-a-friend-form "",
                                                                                                                           :aria-hidden            "true"},
                                                                                                                 :tag     :div,
                                                                                                                 :content ["
                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   nil,
                                                                                                                            :tag     :h2,
                                                                                                                            :content ["Tips en venn om denne annonsen"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:class "stretch640"},
                                                                                                                            :tag     :form,
                                                                                                                            :content ["
                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   {:class              "formelement",
                                                                                                                                                 :data-input-wrapper ""},
                                                                                                                                       :tag     :div,
                                                                                                                                       :content ["
                                                                                                                                                "
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   {:for "taf_email_to",
                                                                                                                                                            :id  "taf_email_to_label"},
                                                                                                                                                  :tag     :label,
                                                                                                                                                  :content ["Mottakers e-post"]}
                                                                                                                                                 "
                                                                                                                                                                "
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   {:class "input"},
                                                                                                                                                  :tag     :div,
                                                                                                                                                  :content [{:type    :element,
                                                                                                                                                             :attrs   {:id    "taf_email_to",
                                                                                                                                                                       :type  "email",
                                                                                                                                                                       :name  "to",
                                                                                                                                                                       :class "span4"},
                                                                                                                                                             :tag     :input,
                                                                                                                                                             :content nil}]}
                                                                                                                                                 "
                                                                                                                                                                "]}
                                                                                                                                      "

                                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   {:class "formelement"},
                                                                                                                                       :tag     :div,
                                                                                                                                       :content ["
                                                                                                                                                "
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   {:for "taf_msg"},
                                                                                                                                                  :tag     :label,
                                                                                                                                                  :content ["Kommentar til annonsen"]}
                                                                                                                                                 "
                                                                                                                                                                "
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   {:class "input"},
                                                                                                                                                  :tag     :div,
                                                                                                                                                  :content [{:type    :element,
                                                                                                                                                             :attrs   {:id    "taf_msg",
                                                                                                                                                                       :name  "message",
                                                                                                                                                                       :class "span4",
                                                                                                                                                                       :rows  "3"},
                                                                                                                                                             :tag     :textarea,
                                                                                                                                                             :content nil}]}
                                                                                                                                                 "
                                                                                                                                                                "]}
                                                                                                                                      "

                                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   {:type  "hidden",
                                                                                                                                                 :id    "taf_adid",
                                                                                                                                                 :name  "finnkode",
                                                                                                                                                 :value "130001312"},
                                                                                                                                       :tag     :input,
                                                                                                                                       :content nil}
                                                                                                                                      "
                                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   {:type  "hidden",
                                                                                                                                                 :name  "csrfToken",
                                                                                                                                                 :value "HOqcVZcQMrwJqbfQy11g9k6WwIhTLgJJr0Elu4gbLxQ="},
                                                                                                                                       :tag     :input,
                                                                                                                                       :content nil}
                                                                                                                                      "

                                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   {:class "formelement"},
                                                                                                                                       :tag     :div,
                                                                                                                                       :content ["
                                                                                                                                                "]}
                                                                                                                                      "

                                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   {:class "actions"},
                                                                                                                                       :tag     :div,
                                                                                                                                       :content ["
                                                                                                                                                "
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   {:class "disabled"},
                                                                                                                                                  :tag     :button,
                                                                                                                                                  :content ["
                                                                                                                                                               Vi maa be om at du logger deg inn for aa tipse en venn
                                                                                                                                                           "]}
                                                                                                                                                 "
                                                                                                                                                                "
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   {:data-tip-a-friend-feedback "",
                                                                                                                                                            :id                         "taf_error"},
                                                                                                                                                  :tag     :span,
                                                                                                                                                  :content nil}
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   {:id "taf_sent"},
                                                                                                                                                  :tag     :span,
                                                                                                                                                  :content nil}
                                                                                                                                                 "
                                                                                                                                                                "]}
                                                                                                                                      "
                                                                                                                                                     "]}
                                                                                                                           "
                                                                                                                                          "]}
                                                                                                                "\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   {:class "h1 word-break mbn"},
                                                                                                                 :tag     :h1,
                                                                                                                 :content ["Onsker du aa jobbe med leveranser/integrasjoner  i et spennende selskap?"]}
                                                                                                                "\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   {:class "r-prl mhn multicol"},
                                                                                                                 :tag     :dl,
                                                                                                                 :content ["
                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "key"},
                                                                                                                            :tag     :dt,
                                                                                                                            :content ["Arbeidsgiver"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "value"},
                                                                                                                            :tag     :dd,
                                                                                                                            :content ["Centric IT Professionals AS"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "key"},
                                                                                                                            :tag     :dt,
                                                                                                                            :content ["Stillingstittel"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "value"},
                                                                                                                            :tag     :dd,
                                                                                                                            :content ["Konsulent"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "key"},
                                                                                                                            :tag     :dt,
                                                                                                                            :content ["Sted"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "value"},
                                                                                                                            :tag     :dd,
                                                                                                                            :content ["Stavanger"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "key"},
                                                                                                                            :tag     :dt,
                                                                                                                            :content ["Frist"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "value"},
                                                                                                                            :tag     :dd,
                                                                                                                            :content ["Snarest"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "key"},
                                                                                                                            :tag     :dt,
                                                                                                                            :content ["Varighet"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "value"},
                                                                                                                            :tag     :dd,
                                                                                                                            :content ["Engasjement"]}
                                                                                                                           "
                                                                                                                                          "]}
                                                                                                                "\n\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   nil,
                                                                                                                 :tag     :p,
                                                                                                                 :content ["
                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:href            "https://www.finn.no/job/employer/company/183",
                                                                                                                                      :data-controller "trackShowCompanyProfile"},
                                                                                                                            :tag     :a,
                                                                                                                            :content ["
                                                                                                                                     Bli kjent med CENTRIC - We Believe in People"]}
                                                                                                                           "
                                                                                                                                          "]}
                                                                                                                "\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   {:data-controller  "elementInViewTracking",
                                                                                                                           :data-ec-track    "scroll-upper-classified",
                                                                                                                           :data-adobe-track "navigation.scroll-upper-classified.scroll"},
                                                                                                                 :tag     :div,
                                                                                                                 :content nil}
                                                                                                                "\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   {:class            "object-description mbl",
                                                                                                                           :data-controller  "scrollStartTracking",
                                                                                                                           :data-ec-track    "scroll-mid-classified",
                                                                                                                           :data-adobe-track "navigation.scroll-mid-classified.scroll"},
                                                                                                                 :tag     :div,
                                                                                                                 :content ["
                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:class "r-margin"},
                                                                                                                            :tag     :div,
                                                                                                                            :content [{:type    :element,
                                                                                                                                       :attrs   nil,
                                                                                                                                       :tag     :p,
                                                                                                                                       :content [{:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :em,
                                                                                                                                                  :content ["Centric er et av Europas mest offensive IT selskaper, med over 5000 ansatte."]}
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :br,
                                                                                                                                                  :content nil}
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :em,
                                                                                                                                                  :content ["I Norge har vi en spennende reise foran oss. Vi har en ambisios maalsetning om sterk vekst og er derfor "]}
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :em,
                                                                                                                                                  :content ["paa jakt etter de beste IT-hodene som kan gjore en forskjell. I Centric vil du faa utfordrende oppdrag i et sterkt fagmiljo. Vi tilbyr faglig utvikling og en tilpasset karriereplan innenfor ditt kompetanseomraade. Vi har vaart hovedkontor i Oslo og regionskontorer som dekker omraadene Akershus, Buskerud, Vestfold, Hedmark, Oppland, Rogaland, Hordaland, Trondelag og Troms.."]}
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :br,
                                                                                                                                                  :content nil}
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :br,
                                                                                                                                                  :content nil}
                                                                                                                                                 "Til kunden vaar er vi paa jakt etter nye teammedlemmer til deres leveranse- og integrasjonsutviklingsteam. Er du en person som liker aa ta ansvar, komme med forslag, og ser utviklingsmuligheter, da kan dette vaere stillingen for deg!"]}]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   nil,
                                                                                                                            :tag     :h2,
                                                                                                                            :content ["Arbeidsoppgaver"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:class "r-margin"},
                                                                                                                            :tag     :div,
                                                                                                                            :content [{:type    :element,
                                                                                                                                       :attrs   nil,
                                                                                                                                       :tag     :ul,
                                                                                                                                       :content [{:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :li,
                                                                                                                                                  :content ["Leveranse til kunder"]}
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :li,
                                                                                                                                                  :content ["Konfigurering"]}
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :li,
                                                                                                                                                  :content ["Systemutvikling"]}
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :li,
                                                                                                                                                  :content ["Programmering"]}]}]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   nil,
                                                                                                                            :tag     :h2,
                                                                                                                            :content ["onskede kvalifikasjoner"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:class "r-margin"},
                                                                                                                            :tag     :div,
                                                                                                                            :content [{:type    :element,
                                                                                                                                       :attrs   nil,
                                                                                                                                       :tag     :ul,
                                                                                                                                       :content [{:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :li,
                                                                                                                                                  :content ["Gode programmeringskunnskaper"]}
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :li,
                                                                                                                                                  :content ["God kunnskap om Microsoft-teknologi"]}
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :li,
                                                                                                                                                  :content ["Fordel om du har erfaring fra en teknisk konsulentrolle"]}
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :li,
                                                                                                                                                  :content ["Utdanning innen IT fra hoyskole eller universitet"]}]}
                                                                                                                                      "Glodende interesse for teknologi og produktutvikling kan kompensere for manglende erfaring"
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   nil,
                                                                                                                                       :tag     :br,
                                                                                                                                       :content nil}
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   nil,
                                                                                                                                       :tag     :br,
                                                                                                                                       :content nil}
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   nil,
                                                                                                                                       :tag     :b,
                                                                                                                                       :content ["Personlige egenskaper:"]}
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   nil,
                                                                                                                                       :tag     :ul,
                                                                                                                                       :content [{:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :li,
                                                                                                                                                  :content ["Har god teknisk forstaaelse og er faglig engasjert"]}
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :li,
                                                                                                                                                  :content ["Er initiativrik"]}
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :li,
                                                                                                                                                  :content ["Har gode samarbeidsevner"]}
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :li,
                                                                                                                                                  :content ["Er serviceinnstilt, fleksibel og strukturert"]}
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :li,
                                                                                                                                                  :content ["Er kreativ og skapende"]}
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :li,
                                                                                                                                                  :content ["Er flytende i norsk og engelsk, skriftlig og muntlig"]}]}]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   nil,
                                                                                                                            :tag     :h2,
                                                                                                                            :content ["Vi kan tilby"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:class "r-margin"},
                                                                                                                            :tag     :div,
                                                                                                                            :content [{:type    :element,
                                                                                                                                       :attrs   nil,
                                                                                                                                       :tag     :ul,
                                                                                                                                       :content [{:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :li,
                                                                                                                                                  :content ["Mulighet for fri tilgang til Skillport, en online laeringsportal med e-boker, lydboker, kurs, videoer og eksamenstester. Med Skillsoft kan du laere naar du vil, hvor du vil!"]}
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :li,
                                                                                                                                                  :content ["Inside Centric: Faa tilgang til en rekke tilbud og fordeler innen kategoriene Helse, Work Life Balance og Reise. Vi tilbyr f. eks. rabatt paa SATS Elixia, Norges storste treningssenterkjede."]}
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :li,
                                                                                                                                                  :content ["Gratis MTA-sertifisering. Faa en innforing i Microsofts ulike teknologier innen infrastruktur, database og programmering."]}
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :li,
                                                                                                                                                  :content ["Gode muligheter for karriereutvikling"]}
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :li,
                                                                                                                                                  :content ["Invitasjon til konsulentsamlinger"]}
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   nil,
                                                                                                                                                  :tag     :li,
                                                                                                                                                  :content ["Personlig og tett oppfolging av konsulentansvarlig"]}]}
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   nil,
                                                                                                                                       :tag     :br,
                                                                                                                                       :content nil}
                                                                                                                                      "For sporsmaal om stillingen, kontakt Guro Fray paa guro.fray@centric.eu eller 98037002."
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   nil,
                                                                                                                                       :tag     :br,
                                                                                                                                       :content nil}
                                                                                                                                      "Sokere vil bli vurdert fortlopende."]}
                                                                                                                           "
                                                                                                                                          "]}
                                                                                                                "\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   {:data-controller  "elementInViewTracking",
                                                                                                                           :data-ec-track    "scroll-bottom-classified",
                                                                                                                           :data-adobe-track "navigation.scroll-bottom-classified.scroll"},
                                                                                                                 :tag     :div,
                                                                                                                 :content nil}
                                                                                                                "\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   {:class "r-prl mhn multicol col-count1"},
                                                                                                                 :tag     :dl,
                                                                                                                 :content ["
                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "key"},
                                                                                                                            :tag     :dt,
                                                                                                                            :content ["Sektor"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "value"},
                                                                                                                            :tag     :dd,
                                                                                                                            :content ["Privat"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "key"},
                                                                                                                            :tag     :dt,
                                                                                                                            :content ["Antall stillinger"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "value"},
                                                                                                                            :tag     :dd,
                                                                                                                            :content ["3"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "key"},
                                                                                                                            :tag     :dt,
                                                                                                                            :content ["Sted"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "value"},
                                                                                                                            :tag     :dd,
                                                                                                                            :content ["4016 Stavanger"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "key"},
                                                                                                                            :tag     :dt,
                                                                                                                            :content ["Bransje"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "value"},
                                                                                                                            :tag     :dd,
                                                                                                                            :content ["IT"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "value",
                                                                                                                                      :class              "no-border"},
                                                                                                                            :tag     :dd,
                                                                                                                            :content ["IT - programvare"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "key"},
                                                                                                                            :tag     :dt,
                                                                                                                            :content ["Stillingsfunksjon"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "value"},
                                                                                                                            :tag     :dd,
                                                                                                                            :content ["IT utvikling / Utvikler (generell)"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "value",
                                                                                                                                      :class              "no-border"},
                                                                                                                            :tag     :dd,
                                                                                                                            :content ["IT utvikling / Systemarkitekt"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "value",
                                                                                                                                      :class              "no-border"},
                                                                                                                            :tag     :dd,
                                                                                                                            :content ["Ingenior"]}
                                                                                                                           "
                                                                                                                                          "]}
                                                                                                                "\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   {:class "mbl"},
                                                                                                                 :tag     :div,
                                                                                                                 :content ["
                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "key"},
                                                                                                                            :tag     :h2,
                                                                                                                            :content ["Nokkelord"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "value"},
                                                                                                                            :tag     :p,
                                                                                                                            :content ["
                                                                                                                                     konfigurering, systemutvikling, programmering, leveranse, microsoft"]}
                                                                                                                           "
                                                                                                                                          "]}
                                                                                                                "\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   {:class "hide-lt768"},
                                                                                                                 :tag     :div,
                                                                                                                 :content ["
                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   nil,
                                                                                                                            :tag     :p,
                                                                                                                            :content ["
                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   {:href            "/reportad.html?finnkode=130001312",
                                                                                                                                                 :data-controller "trackReportAdClick",
                                                                                                                                                 :rel             "external"},
                                                                                                                                       :tag     :a,
                                                                                                                                       :content ["Rapporter annonse"]}
                                                                                                                                      "
                                                                                                                                                     "]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   nil,
                                                                                                                            :tag     :p,
                                                                                                                            :content ["FINN-kode: "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   {:data-adid "130001312",
                                                                                                                                                 :class     "select-all"},
                                                                                                                                       :tag     :span,
                                                                                                                                       :content ["130001312"]}]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   nil,
                                                                                                                            :tag     :p,
                                                                                                                            :content ["Sist endret: 24. sep 2018 13:13"]}
                                                                                                                           "
                                                                                                                                          "]}
                                                                                                                "\n\n"]}
                                                                                                     "\n"]}
                                                                                          "\n"]}
                                                                               "\n"]}
                                                                    "\n"
                                                                    {:type    :element,
                                                                     :attrs   {:class "unit r-size1of3"},
                                                                     :tag     :div,
                                                                     :content ["\n"
                                                                               {:type    :element,
                                                                                :attrs   {:class "mod shadow"},
                                                                                :tag     :div,
                                                                                :content ["\n"
                                                                                          {:type    :element,
                                                                                           :attrs   {:class "inner"},
                                                                                           :tag     :div,
                                                                                           :content ["\n"
                                                                                                     {:type    :element,
                                                                                                      :attrs   {:class "bd"},
                                                                                                      :tag     :div,
                                                                                                      :content ["\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   {:class "company-logo-container"},
                                                                                                                 :tag     :div,
                                                                                                                 :content ["
                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:class "man"},
                                                                                                                            :tag     :h2,
                                                                                                                            :content ["
                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   {:href            "http://www.centric.no",
                                                                                                                                                 :target          "_blank",
                                                                                                                                                 :data-controller "trackShowInterestWebPageLogo"},
                                                                                                                                       :tag     :a,
                                                                                                                                       :content ["
                                                                                                                                                "
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   {:class "centered-element pvl company-logo",
                                                                                                                                                            :src   "https://images.finncdn.no/dynamic/1600w/logo/object/973223138/iad_1370121060756140715logo_centric_l_fc.png",
                                                                                                                                                            :alt   "Centric IT Professionals AS"},
                                                                                                                                                  :tag     :img,
                                                                                                                                                  :content nil}
                                                                                                                                                 "
                                                                                                                                                                "]}
                                                                                                                                      "
                                                                                                                                                     "]}
                                                                                                                           "
                                                                                                                                          "]}
                                                                                                                "\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   nil,
                                                                                                                 :tag     :h2,
                                                                                                                 :content ["Sporsmaal om stillingen"]}
                                                                                                                "\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   {:data-controller "showPhoneNumber"},
                                                                                                                 :tag     :div,
                                                                                                                 :content ["
                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:class "dl-liquid dl-bordered border-sardine removelastborder"},
                                                                                                                            :tag     :dl,
                                                                                                                            :content ["
                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   nil,
                                                                                                                                       :tag     :dt,
                                                                                                                                       :content ["Kontaktperson"]}
                                                                                                                                      "
                                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   nil,
                                                                                                                                       :tag     :dd,
                                                                                                                                       :content ["Guro Therese M. Fray"]}
                                                                                                                                      "
                                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   nil,
                                                                                                                                       :tag     :dt,
                                                                                                                                       :content ["Stillingstittel"]}
                                                                                                                                      "
                                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   nil,
                                                                                                                                       :tag     :dd,
                                                                                                                                       :content ["Researcher"]}
                                                                                                                                      "
                                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   nil,
                                                                                                                                       :tag     :dt,
                                                                                                                                       :content ["Telefon"]}
                                                                                                                                      "
                                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   nil,
                                                                                                                                       :tag     :dd,
                                                                                                                                       :content ["
                                                                                                                                                "
                                                                                                                                                 {:type    :element,
                                                                                                                                                  :attrs   {:href            "tel:+4798037002",
                                                                                                                                                            :class           "select-all",
                                                                                                                                                            :data-controller "trackShowPhoneNumberShow"},
                                                                                                                                                  :tag     :a,
                                                                                                                                                  :content ["  980 37 002"]}
                                                                                                                                                 "
                                                                                                                                                                "]}
                                                                                                                                      "
                                                                                                                                                     "]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:class                       "hidden r-margin",
                                                                                                                                      :data-showphonenumber-result ""},
                                                                                                                            :tag     :div,
                                                                                                                            :content nil}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   nil,
                                                                                                                            :tag     :ul,
                                                                                                                            :content ["
                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   {:class           "mrm mtm",
                                                                                                                                                 :href            "https://www.finn.no/authorizemessaging.html?ci=0&canonicalUrl=https%3A%2F%2Fwww.finn.no%2Fjob%2Ffulltime%2Fad.html%3Ffinnkode%3D130001312&finnkode=130001312",
                                                                                                                                                 :rel             "nofollow",
                                                                                                                                                 :data-controller "trackSendMessage"},
                                                                                                                                       :tag     :a,
                                                                                                                                       :content ["Send melding"]}
                                                                                                                                      "
                                                                                                                                                     "]}
                                                                                                                           "
                                                                                                                                          "]}
                                                                                                                "\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   nil,
                                                                                                                 :tag     :p,
                                                                                                                 :content ["
                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:class           "button order fullwidth",
                                                                                                                                      :href            "https://banners.knollenstein.com/adnetwork/servlet/advertBeans.TrackingServlet?seid=30056226&t=101&cid=CNTRC&vid=1534419018758",
                                                                                                                                      :target          "_blank",
                                                                                                                                      :data-controller "trackApplyForJobClick trackApplyForJobExternalLink"},
                                                                                                                            :tag     :a,
                                                                                                                            :content ["Sok paa stillingen"]}
                                                                                                                           "
                                                                                                                                          "]}
                                                                                                                "\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   {:class "dl-liquid"},
                                                                                                                 :tag     :dl,
                                                                                                                 :content ["
                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "key"},
                                                                                                                            :tag     :dt,
                                                                                                                            :content ["Frist"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-automation-id "value"},
                                                                                                                            :tag     :dd,
                                                                                                                            :content ["
                                                                                                                                     Snarest"]}
                                                                                                                           "
                                                                                                                                          "]}
                                                                                                                "\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   {:class             "media",
                                                                                                                           :data-controller   "orgSubscribe",
                                                                                                                           :data-org-id       "973223138",
                                                                                                                           :data-org-relation "JOB_USER_ORG_AFFINITY",
                                                                                                                           :data-org-name     "Centric IT Professionals AS"},
                                                                                                                 :tag     :div,
                                                                                                                 :content ["
                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:class "button fullwidth utility",
                                                                                                                                      :href  "/loginForm.html"},
                                                                                                                            :tag     :a,
                                                                                                                            :content ["Folg firma"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:data-org-subscribers "",
                                                                                                                                      :class                "bd stone centerify mtm"},
                                                                                                                            :tag     :div,
                                                                                                                            :content ["
                                                                                                                                     1135 folger dette firmaet"]}
                                                                                                                           "
                                                                                                                                          "]}
                                                                                                                "\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   nil,
                                                                                                                 :tag     :ul,
                                                                                                                 :content ["
                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:class "mbs"},
                                                                                                                            :tag     :li,
                                                                                                                            :content ["
                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   {:href            "http://www.centric.no",
                                                                                                                                                 :data-controller "trackShowInterestWebpage trackAdvertiserWebClick",
                                                                                                                                                 :target          "_blank",
                                                                                                                                                 :rel             "noopener"},
                                                                                                                                       :tag     :a,
                                                                                                                                       :content ["Hjemmeside"]}
                                                                                                                                      "
                                                                                                                                                     "]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:class "mbs"},
                                                                                                                            :tag     :li,
                                                                                                                            :content ["
                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   {:href            "https://www.finn.no/job/employer/company/183?activeAds",
                                                                                                                                                 :data-controller "trackMoreAdsFromThisOrganizationLink"},
                                                                                                                                       :tag     :a,
                                                                                                                                       :content ["Flere stillinger fra Centric IT Professionals AS"]}
                                                                                                                                      "
                                                                                                                                                     "]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:class "mbs"},
                                                                                                                            :tag     :li,
                                                                                                                            :content ["
                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   {:href            "https://www.finn.no/job/employer/company/183",
                                                                                                                                                 :data-controller "trackShowCompanyProfile"},
                                                                                                                                       :tag     :a,
                                                                                                                                       :content ["
                                                                                                                                                Bli kjent med CENTRIC - We Believe in People"]}
                                                                                                                                      "
                                                                                                                                                     "]}
                                                                                                                           "
                                                                                                                                          "]}
                                                                                                                "\n"]}
                                                                                                     "\n"]}
                                                                                          "\n"]}
                                                                               "\n"
                                                                               {:type    :element,
                                                                                :attrs   {:class "mod shadow"},
                                                                                :tag     :div,
                                                                                :content ["\n"
                                                                                          {:type    :element,
                                                                                           :attrs   {:class "inner"},
                                                                                           :tag     :div,
                                                                                           :content ["\n"
                                                                                                     {:type    :element,
                                                                                                      :attrs   {:class "bd"},
                                                                                                      :tag     :div,
                                                                                                      :content ["\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   nil,
                                                                                                                 :tag     :h2,
                                                                                                                 :content ["4016 Stavanger"]}
                                                                                                                "\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   {:class "centerify",
                                                                                                                           :style "max-width: 400px;margin:auto"},
                                                                                                                 :tag     :div,
                                                                                                                 :content ["
                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:href            "https://kart.finn.no/?finnkode=130001312&lat=58.94652&lng=5.7362237&mapType=finnvector&showPin=0&bl=1",
                                                                                                                                      :rel             "external",
                                                                                                                                      :class           "blockify relative",
                                                                                                                                      :style           "padding-top: 75%;",
                                                                                                                                      :data-controller "trackMap"},
                                                                                                                            :tag     :a,
                                                                                                                            :content ["
                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   {:src   "https://maptiles.finncdn.no/staticmap?lat=58.94652&lng=5.7362237&zoom=12&size=400x300&maptype=norwayVector&showPin=false",
                                                                                                                                                 :alt   "Kart",
                                                                                                                                                 :class "centered-element"},
                                                                                                                                       :tag     :img,
                                                                                                                                       :content nil}
                                                                                                                                      "
                                                                                                                                                     "]}
                                                                                                                           "
                                                                                                                                          "]}
                                                                                                                "\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   {:class "maplink"},
                                                                                                                 :tag     :p,
                                                                                                                 :content ["
                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:class           "mrm",
                                                                                                                                      :href            "https://kart.finn.no/?finnkode=130001312&lat=58.94652&lng=5.7362237&mapType=finnvector&showPin=0&bl=1",
                                                                                                                                      :rel             "external",
                                                                                                                                      :data-controller "trackMap"},
                                                                                                                            :tag     :a,
                                                                                                                            :content ["Stort kart"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:class           "mrm",
                                                                                                                                      :href            "https://kart.finn.no/?finnkode=130001312&lat=58.94652&lng=5.7362237&mapType=finnhybrid&showPin=0&bl=1",
                                                                                                                                      :rel             "external",
                                                                                                                                      :data-controller "trackMap"},
                                                                                                                            :tag     :a,
                                                                                                                            :content ["Hybridkart"]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   {:href            "https://kart.finn.no/?finnkode=130001312&lat=58.94652&lng=5.7362237&mapType=norortho&showPin=0&bl=1",
                                                                                                                                      :rel             "external",
                                                                                                                                      :data-controller "trackMap"},
                                                                                                                            :tag     :a,
                                                                                                                            :content ["Flyfoto"]}
                                                                                                                           "
                                                                                                                                          "]}
                                                                                                                "\n"]}
                                                                                                     "\n"]}
                                                                                          "\n"]}
                                                                               "\n"
                                                                               {:type    :element,
                                                                                :attrs   {:class "hide-ht768"},
                                                                                :tag     :div,
                                                                                :content ["\n"
                                                                                          {:type    :element,
                                                                                           :attrs   {:class "mod shadow"},
                                                                                           :tag     :div,
                                                                                           :content ["\n"
                                                                                                     {:type    :element,
                                                                                                      :attrs   {:class "inner"},
                                                                                                      :tag     :div,
                                                                                                      :content ["\n"
                                                                                                                {:type    :element,
                                                                                                                 :attrs   {:class "bd"},
                                                                                                                 :tag     :div,
                                                                                                                 :content ["
                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   nil,
                                                                                                                            :tag     :p,
                                                                                                                            :content ["
                                                                                                                                     "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   {:href            "/reportad.html?finnkode=130001312",
                                                                                                                                                 :data-controller "trackReportAdClick",
                                                                                                                                                 :rel             "external"},
                                                                                                                                       :tag     :a,
                                                                                                                                       :content ["Rapporter annonse"]}
                                                                                                                                      "
                                                                                                                                                     "]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   nil,
                                                                                                                            :tag     :p,
                                                                                                                            :content ["FINN-kode: "
                                                                                                                                      {:type    :element,
                                                                                                                                       :attrs   {:data-adid "130001312",
                                                                                                                                                 :class     "select-all"},
                                                                                                                                       :tag     :span,
                                                                                                                                       :content ["130001312"]}]}
                                                                                                                           "
                                                                                                                                          "
                                                                                                                           {:type    :element,
                                                                                                                            :attrs   nil,
                                                                                                                            :tag     :p,
                                                                                                                            :content ["Sist endret: 24. sep 2018 13:13"]}
                                                                                                                           "
                                                                                                                                          "]}
                                                                                                                "\n"]}
                                                                                                     "\n"]}
                                                                                          "\n"]}
                                                                               "\n"]}
                                                                    "\n"]}
                                                         "\n\n"
                                                         {:type    :element,
                                                          :attrs   {:data-controller "recommendations",
                                                                    :data-vertical   "job",
                                                                    :data-position   "job-object",
                                                                    :data-adid       "130001312",
                                                                    :class           "hidden"},
                                                          :tag     :div,
                                                          :content nil}
                                                         "\n"]}
                                              "\n"]}
                                   "\n        \n"
                                   {:type    :element,
                                    :attrs   {:src   "https://www.finn.no/ec/REK/MFINN_refcounter",
                                              :alt   "",
                                              :style "display:none;"},
                                    :tag     :img,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:src   "https://www.finn.no/ec/REK/MFINN_bcounter/_adtech_adbutler_advertise_adform_",
                                              :alt   "",
                                              :style "display:none;"},
                                    :tag     :img,
                                    :content nil}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:id "finnlet-footer"},
                                    :tag     :div,
                                    :content ["\n"
                                              {:type :comment, :content [" finnlet-footer v3.1.12 "]}
                                              " "
                                              {:type    :element,
                                               :attrs   {:scoped ""},
                                               :tag     :style,
                                               :content [".footer-footer-3962O{color:#767676;font-size:12px;line-height:16px;background-color:#fff;border-top:1px solid #ddd;border-bottom:1px solid #ddd;padding-bottom:5px}@media(min-width:480px){.footer-footer-3962O{font-size:12px;line-height:16px}}.footer-footer__pageholder-t0ZQ_{background-color:#fff;padding:0;margin:0;max-width:1010px}.footer-footer__pageholder-t0ZQ_.footer-content-width--liquid-1tIkc,.footer-content-width--liquid-1tIkc .footer-footer__pageholder-t0ZQ_{max-width:none}.footer-footer__pageholder-t0ZQ_.footer-content-width--1400-3gky0,.footer-content-width--1400-3gky0 .footer-footer__pageholder-t0ZQ_{max-width:1400px}.footer-footer__pageholder-t0ZQ_.footer-content-width--1600-2M6DP,.footer-content-width--1600-2M6DP .footer-footer__pageholder-t0ZQ_{max-width:1600px}@media(min-width:1300px){.footer-footer__pageholder-t0ZQ_{margin-left:auto;margin-right:auto}}@media(min-width:1300px){.footer-footer__pageholder-t0ZQ_{padding:0 15px}}.footer-footer-3962O a,.footer-footer-3962O a:link,.footer-footer-3962O a:visited{cursor:pointer;color:#0063fb;text-decoration:none}.footer-footer-3962O a:hover,.footer-footer-3962O a:focus,.footer-footer-3962O a:active{color:#0063fb;text-decoration:underline;outline:0}.footer-footer-3962O a,.footer-footer-3962O a:link,.footer-footer-3962O a:visited{color:#767676}.footer-footer-3962O a:hover,.footer-footer-3962O a:focus,.footer-footer-3962O a:active{color:#474445}.footer-footer__link-list-15xL9{text-align:center;margin:8px 0}.footer-footer__link-list-15xL9 a{padding:8px;margin:0 auto;display:inline-block}.footer-footer__link-list__help-P5yXD:before{display:inline-block;float:left;margin-right:4px;content:'';background-repeat:no-repeat;background-size:cover;height:18px;width:18px;background-image:url(\"data:image/svg+xml;charset=utf-8,%3Csvg xmlns=%22http://www.w3.org/2000/svg%22 width=%2218%22 height=%2218%22 viewBox=%220 0 18 18%22%3E %3Cg fill=%22none%22 fill-rule=%22evenodd%22%3E %3Ccircle stroke=%22%23767676%22 cx=%229%22 cy=%229%22 r=%227%22%3E%3C/circle%3E %3Cpath d=%22M8.537 10.56c-.06-.055-.09-.132-.09-.234 0-.283.02-.51.065-.685.043-.173.132-.35.266-.53.134-.182.345-.407.633-.675l.192-.174c.26-.238.453-.443.577-.613.123-.17.185-.375.185-.614 0-.29-.104-.524-.31-.7-.21-.18-.48-.268-.815-.268-.248 0-.482.05-.703.152-.22.102-.472.265-.754.49-.08.065-.16.097-.24.097-.094 0-.18-.05-.262-.152l-.18-.228c-.067-.08-.1-.163-.1-.25 0-.11.047-.203.14-.283.342-.303.685-.528 1.03-.673C8.515 5.072 8.885 5 9.28 5c.65 0 1.182.18 1.597.538.415.36.623.853.623 1.484 0 .282-.05.534-.146.755-.097.22-.22.417-.37.587-.152.17-.36.38-.63.625l-.16.15c-.288.277-.485.49-.592.643-.108.152-.178.347-.21.587-.008.087-.043.154-.107.2-.063.048-.15.07-.256.07h-.232c-.114 0-.2-.026-.26-.08zm-.16 2.206c-.148-.155-.222-.346-.222-.57 0-.21.074-.393.22-.55.148-.155.323-.233.523-.233s.374.078.518.234c.144.156.216.34.216.55 0 .223-.072.414-.216.57-.144.155-.317.233-.518.233-.2 0-.375-.078-.522-.234z%22 fill=%22%23767676%22%3E%3C/path%3E %3C/g%3E %3C/svg%3E\")}.footer-footer__social-3WnEV{display:block;text-align:center;margin:0 8px}.footer-footer__social-3WnEV a{display:inline-block;padding:8px;margin:8px}.footer-footer__copyright-1csZg{width:80%;margin:8px auto;text-align:center}"]}
                                              {:type    :element,
                                               :attrs   {:class "footer-footer-3962O noprint"},
                                               :tag     :footer,
                                               :content [{:type    :element,
                                                          :attrs   {:class                     "footer-footer__pageholder-t0ZQ_",
                                                                    :data-some-footer-tracking ""},
                                                          :tag     :div,
                                                          :content [{:type    :element,
                                                                     :attrs   {:aria-label "Bunntekst",
                                                                               :class      "footer-footer__link-list-15xL9"},
                                                                     :tag     :nav,
                                                                     :content [{:type    :element,
                                                                                :attrs   {:href               "https://jobbifinn.finn.no/",
                                                                                          :data-some-provider "jobbifinn"},
                                                                                :tag     :a,
                                                                                :content ["Jobbe i FINN"]}
                                                                               {:type    :element,
                                                                                :attrs   {:href               "//www.finn.no/innfinn/partner",
                                                                                          :data-some-provider "bedriftskunde"},
                                                                                :tag     :a,
                                                                                :content ["Bli bedriftskunde"]}
                                                                               {:type    :element,
                                                                                :attrs   {:href               "//www.finn.no/finn/admin",
                                                                                          :data-some-provider "admin"},
                                                                                :tag     :a,
                                                                                :content ["Admin for bedrifter"]}
                                                                               {:type    :element,
                                                                                :attrs   {:href               "https://ssa.finn.no",
                                                                                          :data-some-provider "nativeads"},
                                                                                :tag     :a,
                                                                                :content ["Native ads"]}
                                                                               {:type    :element,
                                                                                :attrs   {:href               "https://hjemmehos.finn.no/hc/no",
                                                                                          :data-some-provider "omfinn"},
                                                                                :tag     :a,
                                                                                :content ["Om FINN.no"]}
                                                                               {:type    :element,
                                                                                :attrs   {:href               "https://hjelpesenter.finn.no/hc/no/articles/305274",
                                                                                          :data-some-provider "personvern"},
                                                                                :tag     :a,
                                                                                :content ["Personvernerklaering"]}
                                                                               {:type    :element,
                                                                                :attrs   {:href               "https://hjelpesenter.finn.no/hc/no/articles/211876885",
                                                                                          :data-some-provider "cookie"},
                                                                                :tag     :a,
                                                                                :content ["Cookies"]}
                                                                               {:type    :element,
                                                                                :attrs   {:href               "https://hjelpesenter.finn.no/hc/no",
                                                                                          :class              "footer-footer__link-list__help-P5yXD",
                                                                                          :data-some-provider "hjelp"},
                                                                                :tag     :a,
                                                                                :content ["Hjelp"]}]}
                                                                    {:type    :element,
                                                                     :attrs   {:aria-label "Sosiale medier",
                                                                               :class      "footer-footer__social-3WnEV"},
                                                                     :tag     :nav,
                                                                     :content [{:type    :element,
                                                                                :attrs   {:href               "https://www.facebook.com/finn.no/",
                                                                                          :title              "FINN paa Facebook",
                                                                                          :target             "_blank",
                                                                                          :rel                "noopener",
                                                                                          :data-some-provider "facebook"},
                                                                                :tag     :a,
                                                                                :content [{:type    :element,
                                                                                           :attrs   {:xmlns   "http://www.w3.org/2000/svg",
                                                                                                     :width   "32",
                                                                                                     :height  "32",
                                                                                                     :viewbox "0 0 32 32"},
                                                                                           :tag     :svg,
                                                                                           :content [{:type    :element,
                                                                                                      :attrs   {:fill      "none",
                                                                                                                :fill-rule "evenodd"},
                                                                                                      :tag     :g,
                                                                                                      :content [{:type    :element,
                                                                                                                 :attrs   {:fill "currentColor",
                                                                                                                           :d    "M26.188 27.453c.698 0 1.264-.566 1.264-1.265V5.812c0-.7-.566-1.265-1.264-1.265H5.812c-.7 0-1.264.566-1.264 1.265v20.376c0 .7.565 1.265 1.264 1.265h20.376z"},
                                                                                                                 :tag     :path,
                                                                                                                 :content nil}
                                                                                                                {:type    :element,
                                                                                                                 :attrs   {:fill "#fff",
                                                                                                                           :d    "M20.35 27.45v-8.87h2.976l.446-3.457H20.35v-2.207c0-1 .278-1.683 1.713-1.683h1.83V8.14a24.498 24.498 0 0 0-2.667-.137c-2.64 0-4.446 1.61-4.446 4.57v2.55h-2.985v3.456h2.985v8.87h3.57z"},
                                                                                                                 :tag     :path,
                                                                                                                 :content nil}]}]}]}
                                                                               {:type    :element,
                                                                                :attrs   {:href               "https://twitter.com/finn_no",
                                                                                          :title              "FINN paa Twitter",
                                                                                          :target             "_blank",
                                                                                          :rel                "noopener",
                                                                                          :data-some-provider "twitter"},
                                                                                :tag     :a,
                                                                                :content [{:type    :element,
                                                                                           :attrs   {:xmlns   "http://www.w3.org/2000/svg",
                                                                                                     :width   "32",
                                                                                                     :height  "32",
                                                                                                     :viewbox "0 0 32 32"},
                                                                                           :tag     :svg,
                                                                                           :content [{:type    :element,
                                                                                                      :attrs   {:fill      "currentColor",
                                                                                                                :fill-rule "evenodd",
                                                                                                                :d         "M10.796 27.5c10.565 0 16.347-8.851 16.347-16.514 0-.25 0-.498-.011-.747A11.772 11.772 0 0 0 30 7.228c-1.03.464-2.14.77-3.305.917a5.83 5.83 0 0 0 2.532-3.215 11.358 11.358 0 0 1-3.653 1.404 5.708 5.708 0 0 0-4.19-1.834c-3.171 0-5.748 2.603-5.748 5.807 0 .452.056.894.146 1.324-4.774-.238-9.009-2.558-11.844-6.067a5.85 5.85 0 0 0-.773 2.92 5.836 5.836 0 0 0 2.555 4.833 5.767 5.767 0 0 1-2.6-.724v.08c0 2.806 1.984 5.16 4.605 5.693a5.548 5.548 0 0 1-1.512.203c-.37 0-.728-.034-1.076-.101.729 2.309 2.857 3.984 5.367 4.029a11.45 11.45 0 0 1-7.137 2.49c-.46 0-.919-.022-1.367-.079a16.223 16.223 0 0 0 8.796 2.592"},
                                                                                                      :tag     :path,
                                                                                                      :content nil}]}]}
                                                                               {:type    :element,
                                                                                :attrs   {:href               "https://www.instagram.com/finn_no/",
                                                                                          :title              "FINN paa Instagram",
                                                                                          :target             "_blank",
                                                                                          :rel                "noopener",
                                                                                          :data-some-provider "instagram"},
                                                                                :tag     :a,
                                                                                :content [{:type    :element,
                                                                                           :attrs   {:xmlns   "http://www.w3.org/2000/svg",
                                                                                                     :width   "32",
                                                                                                     :height  "32",
                                                                                                     :viewbox "0 0 32 32"},
                                                                                           :tag     :svg,
                                                                                           :content [{:type    :element,
                                                                                                      :attrs   {:fill      "currentColor",
                                                                                                                :fill-rule "evenodd",
                                                                                                                :d         "M16 2c-3.802 0-4.28.016-5.772.084-1.49.068-2.508.305-3.4.65A6.862 6.862 0 0 0 4.35 4.35a6.863 6.863 0 0 0-1.614 2.48c-.346.89-.583 1.908-.65 3.398C2.016 11.72 2 12.198 2 16c0 3.802.016 4.28.084 5.772.068 1.49.305 2.508.65 3.4.36.92.837 1.7 1.616 2.48a6.863 6.863 0 0 0 2.48 1.613c.89.346 1.908.583 3.398.65 1.493.07 1.97.085 5.772.085 3.802 0 4.28-.016 5.772-.084 1.49-.068 2.508-.305 3.4-.65a6.863 6.863 0 0 0 2.48-1.616 6.862 6.862 0 0 0 1.613-2.48c.346-.89.583-1.908.65-3.398.07-1.493.085-1.97.085-5.772 0-3.802-.016-4.28-.084-5.772-.068-1.49-.305-2.508-.65-3.4a6.863 6.863 0 0 0-1.616-2.48 6.862 6.862 0 0 0-2.48-1.613c-.89-.346-1.908-.583-3.398-.65C20.28 2.015 19.802 2 16 2m0 2.523c3.738 0 4.18.014 5.657.08 1.365.063 2.106.29 2.6.483.653.254 1.12.558 1.61 1.047.49.49.793.957 1.047 1.61.19.494.42 1.235.482 2.6.067 1.476.08 1.92.08 5.657s-.013 4.18-.08 5.657c-.062 1.365-.29 2.106-.482 2.6a4.34 4.34 0 0 1-1.047 1.61c-.49.49-.957.793-1.61 1.047-.494.19-1.235.42-2.6.482-1.476.067-1.92.08-5.657.08s-4.18-.013-5.657-.08c-1.365-.062-2.107-.29-2.6-.482a4.337 4.337 0 0 1-1.61-1.047 4.338 4.338 0 0 1-1.047-1.61c-.192-.494-.42-1.235-.482-2.6-.067-1.476-.08-1.92-.08-5.657s.013-4.18.08-5.657c.062-1.365.29-2.106.482-2.6a4.338 4.338 0 0 1 1.047-1.61c.49-.49.957-.793 1.61-1.047.493-.192 1.235-.42 2.6-.482 1.476-.067 1.92-.08 5.657-.08m0 16.143a4.667 4.667 0 1 1 0-9.334 4.667 4.667 0 0 1 0 9.334M16 8.81a7.19 7.19 0 1 1 0 14.378A7.19 7.19 0 0 1 16 8.81zm9.153-.284a1.68 1.68 0 1 1-3.36 0 1.68 1.68 0 0 1 3.36 0z"},
                                                                                                      :tag     :path,
                                                                                                      :content nil}]}]}
                                                                               {:type    :element,
                                                                                :attrs   {:href               "https://www.youtube.com/user/finn",
                                                                                          :title              "FINN paa YouTube",
                                                                                          :target             "_blank",
                                                                                          :rel                "noopener",
                                                                                          :data-some-provider "youtube"},
                                                                                :tag     :a,
                                                                                :content [{:type    :element,
                                                                                           :attrs   {:xmlns   "http://www.w3.org/2000/svg",
                                                                                                     :width   "32",
                                                                                                     :height  "32",
                                                                                                     :viewbox "0 0 32 32"},
                                                                                           :tag     :svg,
                                                                                           :content [{:type    :element,
                                                                                                      :attrs   {:fill      "currentColor",
                                                                                                                :fill-rule "evenodd",
                                                                                                                :d         "M15.68 6.156c-1.265.004-6.103.039-9.483.283-.548.066-1.741.07-2.806 1.186-.84.849-1.113 2.779-1.113 2.779S2.022 12.48 2 14.644v2.704c.022 2.165.278 4.24.278 4.24s.273 1.93 1.113 2.78c1.065 1.115 2.465 1.08 3.088 1.196 2.05.197 8.316.269 9.369.28h.52c1.348-.008 6.101-.05 9.433-.29.548-.066 1.741-.07 2.806-1.187.84-.85 1.113-2.778 1.113-2.778s.28-2.265.28-4.53v-2.125c0-2.266-.28-4.53-.28-4.53s-.273-1.93-1.113-2.779c-1.065-1.116-2.258-1.12-2.806-1.186-3.38-.244-8.218-.279-9.484-.283h-.637zm-2.573 5.611l7.567 3.948-7.566 3.92-.001-7.868z"},
                                                                                                      :tag     :path,
                                                                                                      :content nil}]}]}]}
                                                                    {:type    :element,
                                                                     :attrs   {:class "footer-footer__copyright-1csZg"},
                                                                     :tag     :div,
                                                                     :content [{:type    :element,
                                                                                :attrs   nil,
                                                                                :tag     :p,
                                                                                :content ["Innholdet er beskyttet etter aandsverksloven. Bruk av automatiserte tjenester (roboter, spidere, indeksering m.m.) samt andre fremgangsmaater for systematisk eller regelmessig bruk er ikke tillatt uten eksplisitt samtykke fra FINN.no."]}
                                                                               {:type    :element,
                                                                                :attrs   nil,
                                                                                :tag     :p,
                                                                                :content ["© 1996–2018 FINN.no AS"]}]}
                                                                    {:type    :element,
                                                                     :attrs   nil,
                                                                     :tag     :script,
                                                                     :content ["var finnletfooter=function(t){function e(i){if(n[i])return n[i].exports;var a=n[i]={i:i,l:!1,exports:{}};return t[i].call(a.exports,a,a.exports,e),a.l=!0,a.exports}var n={};return e.m=t,e.c=n,e.i=function(t){return t},e.d=function(t,n,i){e.o(t,n)||Object.defineProperty(t,n,{configurable:!1,enumerable:!0,get:i})},e.n=function(t){var n=t&&t.__esModule?function(){return t.default}:function(){return t};return e.d(n,\"a\",n),n},e.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},e.p=\"\",e(e.s=0)}([function(t,e,n){\"use strict\";function i(t){if(window.finnAnalytics){var e=a(t.target,\"data-some-provider\");if(e){var n=e.getAttribute(\"data-some-provider\");s[n]&&window.finnAnalytics.trackEvent(s[n])}}}function a(t,e){for(;t&&t.hasAttribute;){if(t.hasAttribute(e))return t;t=t.parentElement}}var r=document.querySelector(\"[data-some-footer-tracking]\");r&&r.addEventListener(\"click\",i);var s={facebook:{analyticsName:\"other.visit-finn-facebook.click\",eventFlags:\"start,ltp\"},twitter:{analyticsName:\"other.visit-finn-twitter.click\",eventFlags:\"start,ltp\"},instagram:{analyticsName:\"other.visit-finn-instagram.click\",eventFlags:\"start,ltp\"},youtube:{analyticsName:\"other.visit-finn-youtube.click\",eventFlags:\"start,ltp\"},jobbifinn:{analyticsName:\"other.visit-finn-jobbifinn.click\",eventFlags:\"start,ltp\"},bedriftskunde:{analyticsName:\"other.visit-finn-bedriftskunde.click\",eventFlags:\"start,success\"},admin:{analyticsName:\"other.visit-finn-admin.click\",eventFlags:\"start,success\"},nativeads:{analyticsName:\"other.visit-finn-nativeads.click\",eventFlags:\"start,ltp\"},omfinn:{analyticsName:\"other.visit-finn-omfinn.click\",eventFlags:\"start,ltp\"},personvern:{analyticsName:\"other.visit-finn-personvern.click\",eventFlags:\"start,ltp\"},cookie:{analyticsName:\"other.visit-finn-cookies.click\",eventFlags:\"start,ltp\"},hjelp:{analyticsName:\"other.visit-finn-hjelp.click\",eventFlags:\"start,ltp\"}}}]);"]}]}]}
                                              "\n"]}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:data-template "save_search_box", :type "text/mustache"},
                                    :tag     :script,
                                    :content ["
                                                 {{#loading}}
                                                 <div class=\"spinner\"></div>
                                             {{/loading}}
                                             {{^loading}}
                                                 {{^loggedIn}}
                                                     {{>login_box}}
                                                 {{/loggedIn}}
                                                 {{#loggedIn}}
                                                     <div class=\"stretched\">
                                                         <form name=\"save-search\">
                                                             {{#saveNew}}
                                                                 <div class=\"input\">
                                                                     <label>Navn
                                                                         <input placeholder=\"Navn paa sok\" name=\"title\" size=\"30\" value=\"{{title}}\" required>
                                                                     </label>
                                                                 </div>
                                                                 <p class=\"mhn mvl\">
                                                                     <label>
                                                                         <input type=\"checkbox\" name=\"notify\" checked>
                                                                         <span class=\"t4\">Ja takk, varsle meg om nye treff!</span>
                                                                     </label>
                                                                 </p>
                                                                 <p class=\"mhn\">
                                                                     Du blir varslet paa e-post, i appen paa mobil og her paa FINN.no
                                                                 </p>
                                                             {{/saveNew}}

                                                             {{^saveNew}}
                                                                 {{#searchParamsChanged}}
                                                                     <div class=\"pam\">Du har endret det lagrede soket «<b>{{search.title}}</b>»</div>
                                                                     <p class=\"h2 mhn\">
                                                                         <button type=\"button\" class=\"blank\" data-action=\"update\">
                                                                             Lagre endringene
                                                                         </button>
                                                                     </p>
                                                                 {{/searchParamsChanged}}
                                                                 {{^searchParamsChanged}}
                                                                     <div class=\"pam\">Du har allerede lagret dette soket med navnet «<b>{{search.title}}</b>»</div>
                                                                 {{/searchParamsChanged}}
                                                                 <p class=\"h2 mhn mvl\">
                                                                     <button type=\"button\" class=\"blank\" data-action=\"show-save-new-opts\">
                                                                         Lagre som nytt sok
                                                                     </button>
                                                                     <input name=\"searchid\" type=\"hidden\" value=\"{{search.id}}\">
                                                                 </p>
                                                             {{/saveNew}}

                                                             {{#message}}
                                                                 <p class=\"mhn mvl cherry\">{{message}}</p>
                                                             {{/message}}

                                                             <button class=\"invisible\" tabindex=\"-1\" style=\"width: 1px; height: 1px;\">Send</button>
                                                         </form>
                                                     </div>
                                                 {{/loggedIn}}
                                             {{/loading}}
                                             "]}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:data-template "finnbox.conversation_feedback", :type "text/mustache"},
                                    :tag     :script,
                                    :content ["
                                                 <div class=\"mod mtl ptl\">
                                                 <div class=\"inner centerify pal {{#error}}cherry icon-varsel2{{/error}}\">
                                                     <p class=\"pas {{#inProgress}}inprogress{{/inProgress}}\">{{{feedback}}}</p>
                                                 </div>
                                             </div>"]}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:data-template "favorites.entry", :type "text/mustache"},
                                    :tag     :script,
                                    :content ["
                                                 <li class=\"pvs t3 truncate\" data-favorited=\"{{isFavorite}}\" data-adid=\"{{ad.adId}}\" data-folderid=\"{{folder.folderId}}\" role=\"checkbox\" aria-checked=\"{{#isFavorite}}true{{/isFavorite}}{{^isFavorite}}false{{/isFavorite}}\" tabindex=\"0\" style=\"border-color: #CDD3D8; cursor: default;\">
                                                 {{#isFavorite}}
                                                     <svg width=\"34\" height=\"34\" class=\"valign-middle\">
                                                         <use xlink:href=\"#icon-share-favorite-filled\" class=\"licorice\"></use>
                                                     </svg>
                                                 {{/isFavorite}}
                                                 {{^isFavorite}}
                                                     <svg width=\"34\" height=\"34\" class=\"valign-middle\">
                                                         <use xlink:href=\"#icon-share-favorite-empty\" class=\"licorice\"></use>
                                                     </svg>
                                                 {{/isFavorite}}
                                                 <span class=\"valign-middle\" data-foldername>{{folder.folderName}}</span>
                                             </li>
                                             "]}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:data-template "favorites.togglebutton", :type "text/mustache"},
                                    :tag     :script,
                                    :content ["
                                                 {{#isFavorited}}
                                                 <div>
                                                     <svg width=\"34\" height=\"34\" class=\"valign-middle\">
                                                         <title>Vis favorittlister</title>
                                                         <use xlink:href=\"#icon-share-favorite-filled\" class=\"licorice\"></use>
                                                     </svg>
                                                     <span class=\"hide-lt600\">Lagret i Favoritter</span>
                                                 </div>
                                             {{/isFavorited}}
                                             {{^isFavorited}}
                                                 <div>
                                                     <svg width=\"34\" height=\"34\" class=\"valign-middle\">
                                                         <title>Vis favorittlister</title>
                                                         <use xlink:href=\"#icon-share-favorite-empty\" class=\"licorice\"></use>
                                                     </svg>
                                                     <span class=\"hide-lt600\">Lagre annonsen</span>
                                                 </div>
                                             {{/isFavorited}}
                                             "]}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:data-template "ad.getphonenumber", :type "text/mustache"},
                                    :tag     :script,
                                    :content ["
                                                 {{#needVerification}}
                                                 <p class=\"mhn mtl\">For sikkerhets skyld. Skriv inn mobilnummeret ditt, saa sender vi deg en kode.
                                                 Dette er selvfolgelig gratis.</p>
                                                 <div class=\"line r-margin mhn\">
                                                     <div class=\"unit size3of4 prm\">
                                                         <input value=\"{{userPhone}}\" placeholder=\"Mobilnummer\">
                                                     </div>
                                                     <div class=\"unit size1of4\">
                                                         <button class=\"fullwidth\" data-action=\"submit-phone\">Send</button>
                                                     </div>
                                                 </div>

                                                 <p class=\"d2 mhn mbl\">
                                                     <a href=\"https://hjelpesenter.finn.no/hc/no/articles/305314-Kjenn-igjen-svindelfors%C3%B8k-p%C3%A5-SMS\">
                                                     Hvorfor ber vi deg om dette?</a>
                                                 </p>
                                             {{/needVerification}}

                                             {{#needLogin}}
                                                 <p class=\"mhn mvl\">Du maa vaere innlogget for aa se nummeret.<br>
                                                 <a href=\"/loginForm.html?indicateFresh=true\">Logg inn</a>
                                                 </p>
                                             {{/needLogin}}

                                             {{#needPin}}
                                                 <p class=\"mhn mtl\">Skriv inn koden du fikk tilsendt paa SMS</p>
                                                 <div class=\"line r-margin mhn mbl\">
                                                     <div class=\"unit size3of4 prm\">
                                                         <input placeholder=\"Kode\">
                                                     </div>
                                                     <div class=\"unit size1of4\">
                                                         <button class=\"fullwidth\" data-action=submit-pin>Send</button>
                                                     </div>
                                                 </div>
                                             {{/needPin}}

                                             {{#invalidNumber}}
                                                 <p class=\"mhn mtl\">Ugyldig mobilnummer! Fyll inn ditt mobilnummer og du vil motta en PIN kode.</p>
                                                 <div class=\"line r-margin mhn mbl\">
                                                     <div class=\"unit size3of4 prm\">
                                                         <input placeholder=\"Mobilnummer\" value=\"{{userPhone}}\">
                                                     </div>
                                                     <div class=\"unit size1of4\">
                                                         <button class=\"fullwidth\" data-action=\"submit-phone\">Send</button>
                                                     </div>
                                                 </div>
                                             {{/invalidNumber}}

                                             {{#invalidPin}}
                                                 <p class=\"mhn mtl\">Feil PIN kode! Fyll inn ditt mobilnummer og du vil motta en PIN kode.</p>
                                                 <div class=\"line r-margin mhn mbl\">
                                                     <div class=\"unit size3of4 prm\">
                                                         <input placeholder=\"Mobilnummer\" value=\"{{userPhone}}\">
                                                     </div>
                                                     <div class=\"unit size1of4\">
                                                         <button class=\"fullwidth\" data-action=\"submit-phone\">Send</button>
                                                     </div>
                                                 </div>
                                             {{/invalidPin}}

                                             {{#userBlocked}}
                                                 <p class=\"mhn mvl\">Du er midlertidig blokkert. Du kan prove igjen {{nextPeriodStart}}.</p>
                                             {{/userBlocked}}

                                             {{#unknownState}}
                                                 <p class=\"mhn mvl\">En feil oppstod. Prov igjen senere.</p>
                                             {{/unknownState}}"]}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:data-template "ad.getphonenumber.troika", :type "text/mustache"},
                                    :tag     :script,
                                    :content ["
                                                 {{#needVerification}}
                                                 <div class=\"panel u-ma0\">
                                                     <p class=\"u-mhn\">For sikkerhets skyld. Skriv inn mobilnummeret ditt, saa sender vi deg en kode.
                                                         Dette er selvfolgelig gratis.</p>
                                                     <div class=\"input input--phone u-mb8\">
                                                         <label for=\"phoneInput\">Mobilnummer</label><input type=\"phone\" value=\"{{userPhone}}\" id=\"phoneInput\">
                                                     </div>
                                                     <button class=\"button button--default\" data-action=\"submit-phone\">Send</button>

                                                     <p class=\"u-d2 u-mt4\">
                                                         <a href=\"https://hjelpesenter.finn.no/hc/no/articles/305314-Kjenn-igjen-svindelfors%C3%B8k-p%C3%A5-SMS\" class=\"link\">
                                                             Hvorfor ber vi deg om dette?</a>
                                                     </p>
                                                 </div>
                                             {{/needVerification}}

                                             {{#needLogin}}
                                                 <div class=\"panel u-ma0\">
                                                     <p class=\"u-mmhn\">Du maa vaere innlogget for aa se nummeret.<br>
                                                         <a href=\"/loginForm.html?indicateFresh=true\" class=\"link\">Logg inn</a>
                                                     </p>
                                                 </div>
                                             {{/needLogin}}

                                             {{#needPin}}
                                                 <div class=\"panel u-ma0\">
                                                     <p class=\"u-mhn\">Skriv inn koden du fikk tilsendt paa SMS</p>
                                                     <div class=\"input input--number u-mb8\">
                                                         <label for=\"numberInput\">Kode</label><input type=\"number\" id=\"numberInput\">
                                                     </div>
                                                     <button class=\"button button--default\" data-action=submit-pin>Send</button>

                                                 </div>
                                             {{/needPin}}

                                             {{#invalidNumber}}
                                                 <div class=\"panel u-ma0\">
                                                     <p class=\"mhn mtl\">Ugyldig mobilnummer! Fyll inn ditt mobilnummer og du vil motta en PIN kode.</p>
                                                     <div class=\"input input--phone u-mb8\">
                                                         <label for=\"phoneInput\">Mobilnummer</label><input type=\"phone\" value=\"{{userPhone}}\" id=\"phoneInput\">
                                                     </div>
                                                     <button class=\"button button--default\" data-action=\"submit-phone\">Send</button>
                                                 </div>
                                             {{/invalidNumber}}

                                             {{#invalidPin}}
                                                 <div class=\"panel u-ma0\">
                                                     <p>Feil PIN kode! Fyll inn ditt mobilnummer og du vil motta en PIN kode.</p>
                                                     <div class=\"input input--phone u-mb8\">
                                                         <label for=\"phoneInput\">Mobilnummer</label><input type=\"phone\" value=\"{{userPhone}}\" id=\"phoneInput\">
                                                     </div>
                                                     <button class=\"button button--default\" data-action=\"submit-phone\">Send</button>
                                                 </div>
                                             {{/invalidPin}}

                                             {{#userBlocked}}
                                                 <div class=\"panel u-ma0\">
                                                     <p>Du er midlertidig blokkert. Du kan prove igjen {{nextPeriodStart}}.</p>
                                                 </div>
                                             {{/userBlocked}}

                                             {{#unknownState}}
                                                 <div class=\"panel u-ma0\">
                                                     <p class=\"mhn mvl\">En feil oppstod. Prov igjen senere.</p>
                                                 </div>
                                             {{/unknownState}}
                                             "]}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:data-template "ad_statistics_numbers", :type "text/mustache"},
                                    :tag     :script,
                                    :content ["
                                                 <div class=\"pvm\">
                                                 <dl class=\"dl-liquid dl-bordered mvn\">
                                                     {{#counters}}
                                                         <dt class=\"mhn\"><div class=\"notification milk centerify inlineblockify mrs\" style=\"background-color:{{color}}\">&nbsp;</div>{{description}}</dt>
                                                         <dd class=\"border-sardine mhn\">{{totalValue}} {{unit}}</dd>
                                                     {{/counters}}

                                                     <dt class=\"mhn mtl\"><div class=\"notification bg-milk milk centerify inlineblockify mrs\">&nbsp;</div>Total trafikk</dt>
                                                     <dd class=\"border-sardine mhn mtl\">{{sumPeriodValue}} {{sumPeriodUnit}}</dd></dd>
                                                 </dl>
                                             </div>
                                             "]}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:data-template "ad_statistics_interest", :type "text/mustache"},
                                    :tag     :script,
                                    :content ["
                                                 {{#repeativeVisits}}
                                                 <div class=\"pvm inner\">
                                                     <h4 class=\"mhn\">Hvor mange har besokt flere ganger?</h4>
                                                     <dl class=\"dl-liquid dl-bordered mvn\">
                                                         {{#counters}}
                                                             <dt class=\"mhn\">{{description}}</dt>
                                                             <dd class=\"border-sardine\">{{totalValue}} {{unit}}</dd>
                                                         {{/counters}}
                                                     </dl>
                                                 </div>
                                             {{/repeativeVisits}}

                                             {{#defaultStatistics}}
                                                 <div class=\"pvm inner\">
                                                     <h4 class=\"mhn\">Andre tall</h4>
                                                     <dl class=\"dl-liquid dl-bordered mvn\">
                                                         {{#counters}}
                                                             <dt class=\"mhn\">{{description}}</dt>
                                                             <dd class=\"border-sardine mhn\">{{totalValue}} {{unit}}</dd>
                                                         {{/counters}}
                                                     </dl>
                                                 </div>
                                             {{/defaultStatistics}}

                                             {{#distributionVisitors}}
                                                 {{#present}}
                                                     <div class=\"pvm inner\">
                                                         <h4>Besokende fra {{label}}</h4>
                                                         <dl class=\"dl-liquid dl-bordered mvn\">
                                                             <dt class=\"mhn\">{{label}}</dt> <dd class=\"border-sardine mhn\">{{distributionPercentage}}</dd>
                                                             <dt class=\"mhn\">Antall fra {{label}}</dt> <dd class=\"border-sardine mhn\">{{distributionVisitorCount}}</dd>
                                                             <dt class=\"mhn\">Av totalt antall besokende</dt> <dd class=\"border-sardine mhn\">{{totalVisitorCount}}</dd>
                                                         </dl>
                                                     </div>
                                                 {{/present}}
                                             {{/distributionVisitors}}
                                             "]}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:data-template "ad-section-units", :type "text/mustache"},
                                    :tag     :script,
                                    :content ["
                                                 {{#displaySearchResults}}
                                                 <tr class=\"clickable\">
                                                     <th><a href=\"{{adUrl}}\">{{bodyRow.0}}</a></th>
                                                     <td class=\"rightify\">{{bodyRow.1}}</td>
                                                     <td class=\"rightify\">{{bodyRow.2}}</td>
                                                     <td class=\"rightify\">{{bodyRow.3}}</td>
                                                     <td class=\"rightify\">{{bodyRow.4}}</td>
                                                     <td class=\"rightify\">{{bottomRow1}}</td>
                                                 </tr>
                                             {{/displaySearchResults}}"]}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:data-template "recommendation_items", :type "text/mustache"},
                                    :tag     :script,
                                    :content ["
                                                 <div class=\"mod shadow\">
                                                 <div class=\"inner pvn\">
                                                     <div class=\"bd\">
                                                         <h2 class=\"d1 strong fixedfontsize\">{{recommendations.heading}}</h2>

                                                         <div class=\"line r-cols1to3 r-mhm r-hide-last-element r-carousel\" data-uuid=\"{{recommendations.uuid}}\">
                                                             {{#items}}
                                                                 <div class=\"unit\">
                                                                     <a href=\"{{url}}\" class=\"linkblock licorice blockify r-mhm mtn mbl\" data-version=\"{{version}}\" data-finncode=\"{{itemId}}\" data-trackingcode=\"{{trackingCode}}\" data-score=\"{{score}}\">
                                                                         {{#image.isLogo}}
                                                                             <div class=\"company-logo-container bat\">
                                                                                 <img src=\"https://images.finncdn.no/dynamic/960w/{{image.url}}\"
                                                                                      class=\"centered-element pvl company-logo\" alt=\"\"
                                                                                 >
                                                                         {{/image.isLogo}}
                                                                         {{^image.isLogo}}
                                                                             <div class=\"format4by3\">
                                                                                 <img src=\"https://images.finncdn.no/dynamic/480x360c/{{image.url}}\"
                                                                                      srcset=\"https://images.finncdn.no/dynamic/480x360c/{{image.url}} 480w,
                                                                                             https://images.finncdn.no/dynamic/240x180c/{{image.url}} 240w,
                                                                                             https://images.finncdn.no/dynamic/320x240c/{{image.url}} 320w,
                                                                                             https://images.finncdn.no/dynamic/640x480c/{{image.url}} 640w,
                                                                                             https://images.finncdn.no/dynamic/960x720c/{{image.url}} 960w\"
                                                                                      sizes=\"(min-width: 990px) 300px, (min-width: 768px) 33vw, (min-width: 480px) 50vw\"
                                                                                      class=\"centered-image\" alt=\"\"
                                                                                 >
                                                                         {{/image.isLogo}}
                                                                             {{^mlt}}
                                                                                 <div class=\"result-item__favorite\">
                                                                                     <button type=\"button\" tabindex=\"-1\" class=\"blank r-pam ghost-icon icon-remove\" data-recommendation-block title=\"Fjern anbefaling\" aria-label=\"Fjern anbefaling\">
                                                                                         <svg focusable=\"false\" width=\"30\" height=\"30\" class=\"valign-middle\"><use xlink:href=\"#icon-remove\"></use></svg>
                                                                                     </button>
                                                                                 </div>
                                                                             {{/mlt}}
                                                                         </div>
                                                                         <h4 class=\"truncate r-mhm r-mtm mbt\">{{heading}}</h4>
                                                                         <p class=\"truncate r-mhm mtn r-mbm\">
                                                                             {{#subheading}}
                                                                                 <span class=\"t4 primary-blue prm\">{{subheading}}</span>
                                                                             {{/subheading}}
                                                                             <span class=\"licorice man\" title=\"{{location.combined}}\">{{location.combined}}</span>
                                                                         </p>
                                                                     </a>
                                                                 </div>
                                                             {{/items}}
                                                         </div>
                                                     </div>
                                                 </div>
                                             </div>
                                             "]}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:data-template "recommendations_stream", :type "text/mustache"},
                                    :tag     :script,
                                    :content ["
                                                 <section aria-labelledby=\"recommendations-heading\" data-uuid=\"{{recommendations.uuid}}\">
                                                 <h2 id=\"recommendations-heading\" class=\"u-t3\">{{recommendations.heading}}</h2>
                                                 <div class=\"ad-stream grid grid--cols2upto640 grid--cols3upto990 grid--cols3from990\">
                                                     {{#items}}
                                                         <div class=\"ad-stream__unit grid__unit\">
                                                             <article class=\"ad-preview ad-preview--actions-left\" data-version=\"{{version}}\" data-finncode=\"{{itemId}}\" data-score=\"{{score}}\" data-trackingcode=\"{{trackingCode}}\">
                                                                 <a class=\"ad-preview__click-area\" href=\"{{url}}\">
                                                                     <div class=\"ad-preview__media\">
                                                                         <div class=\"img-format img-format--ratio1by1 img-format--centered\">
                                                                             <img src=\"https://images.finncdn.no/dynamic/480x480c/{{image.url}}\"
                                                                                  srcset=\"https://images.finncdn.no/dynamic/480x480c/{{image.url}} 480w,
                                                                         https://images.finncdn.no/dynamic/240x240c/{{image.url}} 240w,
                                                                         https://images.finncdn.no/dynamic/360x360c/{{image.url}} 360w,
                                                                         https://images.finncdn.no/dynamic/720x720c/{{image.url}} 720w\"
                                                                                  sizes=\"(min-width: 990px) 330px, (min-width: 768px) 33vw, (min-width: 480px) 50vw\"
                                                                                  class=\"img-format__img\" alt=\"\"
                                                                             />
                                                                         </div>
                                                                         {{#subheading}}
                                                                             <div class=\"ad-preview__media__tag\">
                                                                                 <div class=\"ad-preview__tag\">
                                                                                     <span class=\"ad-stream__price\">{{subheading}}</span>
                                                                                 </div>
                                                                             </div>
                                                                         {{/subheading}}
                                                                     </div>
                                                                     <div class=\"ad-preview__text\">
                                                                         <p class=\"ad-stream__location\">{{location.combined}}</p>
                                                                         <h3 class=\"ad-stream__description\">{{heading}}</h3>
                                                                     </div>
                                                                 </a>
                                                                 {{^recommendations.mlt}}
                                                                     <div class=\"ad-preview__actions\">
                                                                         <button class=\"image-icon image-icon--remove\" type=\"button\" title=\"Fjern anbefaling\" aria-label=\"Fjern anbefaling\" data-recommendation-block>
                                                                         </button>
                                                                     </div>
                                                                 {{/recommendations.mlt}}
                                                             </article>
                                                         </div>
                                                     {{/items}}
                                                 </div>
                                             </section>
                                             "]}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:data-template "minfinn-drafted-ads", :type "text/mustache"},
                                    :tag     :script,
                                    :content ["
                                                 {{#draftedAds}}
                                                 <div class=\"unit flex align-items-stretch result-item\">
                                                     <div class=\"mod flex align-items-stretch man userhistory licorice unoverflowify\">
                                                         <div class=\"inner r-pal\">
                                                             <div class=\"bd\">
                                                                 <a id=\"{{adId}}\" href=\"{{adUrl}}\">
                                                                     <div class=\"result-item-image\" style=\"max-width: 170px\">
                                                                         {{#imageUrl}}
                                                                             <div class=\"format4by3\">
                                                                                 <img class=\"centered-image\" src=\"{{imageUrl}}\" alt=\"\">
                                                                             </div>
                                                                         {{/imageUrl}}
                                                                         {{^imageUrl}}
                                                                             <div class=\"format4by3 bg-ice\">
                                                                                 <img class=\"centered-image\" src=\"{{CTX.cdnUrl}}/static/images/no-image.5bf83e47.svg\" alt=\"Bilde mangler\">
                                                                             </div>
                                                                         {{/imageUrl}}
                                                                     </div>
                                                                 </a>

                                                                 <div class=\"unoverflowify\">
                                                                     <div class=\"d1 unoverflowify rightify\">
                                                                         <span class=\"licorice fleft\">
                                                                             {{#bodyRow}}
                                                                                 {{#.}} {{.}} - {{/.}}
                                                                             {{/bodyRow}}
                                                                             {{#bottomRow1}}
                                                                                 {{bottomRow1}}
                                                                             {{/bottomRow1}}
                                                                         </span>

                                                                         {{#topRowLeft}}
                                                                             <span class=\"objectstatus lastcall phs pvn\">
                                                                                 {{topRowLeft.displayText}}
                                                                             </span>
                                                                         {{/topRowLeft}}
                                                                     </div>

                                                                     {{#titleRow}}<h3 class=\"t4 word-break mhn truncate\" style=\"white-space: nowrap;\">{{titleRow}}</h3>{{/titleRow}}
                                                                     {{^titleRow}}<h3 class=\"t4 word-break mhn\">Tittel mangler</h3>{{/titleRow}}

                                                                     {{#classifiedAd}}
                                                                         <div class=\"r-mts\">
                                                                             <input class=\"button small r-pas r-mrm\" type=\"button\" onclick=\"location.href='/innfinn/adselection/ad/{{adId}}';\" value=\"Fullfor annonsen\"/>
                                                                             <input class=\"button small r-pas\" type=\"button\" onclick=\"location.href='{{adUrl}}';\" value=\"Flere valg\"/>
                                                                         </div>
                                                                     {{/classifiedAd}}

                                                                     {{^classifiedAd}}
                                                                         <div class=\"r-mts\">
                                                                             <input class=\"button small r-pas\" type=\"button\" onclick=\"location.href='{{adUrl}}';\" value=\"Fullfor annonsen\"/>
                                                                         </div>
                                                                     {{/classifiedAd}}

                                                                 </div>
                                                             </div>
                                                         </div>
                                                     </div>
                                                 </div>
                                             {{/draftedAds}}
                                             "]}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:data-template "minfinn-active-ads", :type "text/mustache"},
                                    :tag     :script,
                                    :content ["
                                                 {{#activeAds}}
                                                 <div class=\"unit flex align-items-stretch result-item\">
                                                     <div class=\"mod flex align-items-stretch man userhistory licorice unoverflowify\">
                                                         <div class=\"inner r-pal\">
                                                             <div class=\"bd\">
                                                                 <a id=\"{{adId}}\" href=\"{{adUrl}}\">
                                                                     <div class=\"result-item-image\" style=\"max-width: 170px\">
                                                                         {{#imageUrl}}
                                                                             <div class=\"format4by3\">
                                                                                 <img class=\"centered-image\" src=\"{{imageUrl}}\" alt=\"\">
                                                                             </div>
                                                                         {{/imageUrl}}
                                                                         {{^imageUrl}}
                                                                             <div class=\"format4by3 bg-ice\">
                                                                                 <img class=\"centered-image\" src=\"{{CTX.cdnUrl}}/static/images/no-image.5bf83e47.svg\" alt=\"Bilde mangler\">
                                                                             </div>
                                                                         {{/imageUrl}}
                                                                     </div>
                                                                 </a>

                                                                 <div class=\"unoverflowify\">
                                                                     <div class=\"d1 unoverflowify rightify\">
                                                                         <span class=\"licorice fleft\">
                                                                             {{#bodyRow}}
                                                                                 {{#.}}{{.}} - {{/.}}
                                                                             {{/bodyRow}}
                                                                             {{#bottomRow1}}
                                                                                 {{bottomRow1}}
                                                                             {{/bottomRow1}}
                                                                         </span>

                                                                         {{#topRowLeft}}
                                                                             <span class=\"objectstatus updated phs pvn\">
                                                                                 {{topRowLeft.displayText}}
                                                                             </span>
                                                                         {{/topRowLeft}}
                                                                     </div>

                                                                     {{#titleRow}}<h3 class=\"t4 word-break mhn truncate r-mvm\" style=\"white-space: nowrap;\">{{titleRow}}</h3>{{/titleRow}}
                                                                     {{^titleRow}}<h3 class=\"t4 word-break mhn truncate r-mvm\">Tittel mangler</h3>{{/titleRow}}

                                                                     <div class=\"relative flex justify-space-between\" data-automation-id=\"bottomRow1\">
                                                                         <div class=\"size2of5\">
                                                                             <div class=\"d1 r-mvm\">

                                                                                 {{#viewCounter}}
                                                                                     <svg id=\"eye\" viewBox=\"0 12 96 96\" width=\"18\" height=\"18\" class=\"valign-middle\">
                                                                                         <g fill=\"#9BA8B1\">
                                                                                             <path d=\"M48,20c21.15,0,34.502,19.998,38.998,28C82.494,56.016,69.145,76,48,76C26.853,76,13.503,56.118,9.003,48.149 C13.5,40.101,26.853,20,48,20 M48,12C16,12,0,48.166,0,48.166S16,84,48,84s48-36,48-36S80,12,48,12L48,12z\"/>
                                                                                             <path d=\"M48,40c4.411,0,8,3.589,8,8s-3.589,8-8,8s-8-3.589-8-8S43.589,40,48,40 M48,32c-8.836,0-16,7.164-16,16 c0,8.837,7.164,16,16,16c8.837,0,16-7.163,16-16C64,39.164,56.837,32,48,32L48,32z\"/>
                                                                                         </g>
                                                                                     </svg>

                                                                                     <span class=\"t5 licorice mvn\">
                                                                                         {{#viewCounter}}
                                                                                             {{viewCounter}}
                                                                                         {{/viewCounter}}

                                                                                         {{^viewCounter}}
                                                                                             0
                                                                                         {{/viewCounter}}
                                                                                     </span>
                                                                                 {{/viewCounter}}

                                                                             </div>
                                                                         </div>

                                                                         <div class=\"size1of5\">
                                                                             <div class=\"d1 r-mvm\">
                                                                                 {{#viewCounter}}
                                                                                     <svg id=\"icon-share-favorite-filled\" width=\"18\" height=\"18\" viewBox=\"0 5 30 30\" class=\"valign-middle\">
                                                                                         <g fill=\"#9BA8B1\">
                                                                                             <path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M14.3 8.3C10.508 4.197 4.2 7.42 4.2 13c0 5.208 6.66 9.656 9.7 11.3.77.413 1.385.378 2.2 0 2.865-1.333 9.7-5.694 9.7-11.3 0-5.56-6.36-8.907-10.1-4.7-.35.393-.997.434-1.4 0z\"/>
                                                                                         </g>
                                                                                     </svg>
                                                                                     <span class=\"t5 licorice mvn\">
                                                                                         {{#saveCounter}}
                                                                                             {{saveCounter}}
                                                                                         {{/saveCounter}}

                                                                                         {{^saveCounter}}
                                                                                             0
                                                                                         {{/saveCounter}}
                                                                                     </span>
                                                                                 {{/viewCounter}}
                                                                             </div>
                                                                         </div>

                                                                         <div class=\"size2of5\">
                                                                             <div class=\"d1  r-mvm fright\">
                                                                                 {{#daysLeft}}
                                                                                     <span class=\"t5 licorice mvn\">
                                                                                         {{daysLeft}}
                                                                                     </span>
                                                                                     dager igjen
                                                                                 {{/daysLeft}}
                                                                             </div>
                                                                         </div>
                                                                     </div>

                                                                     {{#classifiedAd}}
                                                                         <div class=\"r-mts\">
                                                                             <input class=\"button small r-pas r-mrm\" type=\"button\" onclick=\"location.href='/innfinn/adselection/ad/{{adId}}';\" value=\"Endre\"/>
                                                                             <input class=\"button small r-pas r-mrm\" type=\"button\" onclick=\"location.href='{{CTX.wwwSite}}/{{adId}}';\" value=\"Se annonsen\"/>
                                                                             <input class=\"button small r-pas\" type=\"button\" onclick=\"location.href='{{adUrl}}';\" value=\"Flere valg\"/>
                                                                         </div>
                                                                     {{/classifiedAd}}

                                                                     {{^classifiedAd}}
                                                                         <div class=\"r-mts\">
                                                                             <input class=\"button small r-pas r-mrm\" type=\"button\" onclick=\"location.href='{{CTX.wwwSite}}/smajobber/legg-ut-smajobb/{{adId}}';\" value=\"Endre\"/>
                                                                             <input class=\"button small r-pas\" type=\"button\" onclick=\"location.href='{{adUrl}}';\" value=\"Flere valg\"/>
                                                                         </div>
                                                                     {{/classifiedAd}}

                                                                 </div>
                                                             </div>
                                                         </div>
                                                     </div>
                                                 </div>
                                             {{/activeAds}}
                                             "]}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:data-template "minfinn-inactive-ads", :type "text/mustache"},
                                    :tag     :script,
                                    :content ["
                                                 {{#inactiveAds}}
                                                 <div class=\"unit flex align-items-stretch result-item\">
                                                     <div class=\"mod flex align-items-stretch man userhistory licorice unoverflowify\">
                                                         <div class=\"inner r-pal\">
                                                             <div class=\"bd\">
                                                                 <a id=\"{{adId}}\" href=\"{{adUrl}}\">
                                                                     <div class=\"result-item-image\" style=\"max-width: 170px\">
                                                                         {{#imageUrl}}
                                                                             <div class=\"format4by3\">
                                                                                 <img class=\"centered-image\" src=\"{{imageUrl}}\" alt=\"\">
                                                                             </div>
                                                                         {{/imageUrl}}
                                                                         {{^imageUrl}}
                                                                             <div class=\"format4by3 bg-ice\">
                                                                                 <img class=\"centered-image\" src=\"{{CTX.cdnUrl}}/static/images/no-image.5bf83e47.svg\" alt=\"Bilde mangler\">
                                                                             </div>
                                                                         {{/imageUrl}}
                                                                     </div>
                                                                 </a>

                                                                 <div class=\"unoverflowify\">
                                                                     <div class=\"d1 unoverflowify rightify\">
                                                                         <span class=\"licorice fleft\">
                                                                             {{#bodyRow}}
                                                                                 {{#.}} {{.}} - {{/.}}
                                                                             {{/bodyRow}}
                                                                             {{#bottomRow1}}
                                                                                 {{bottomRow1}}
                                                                             {{/bottomRow1}}
                                                                         </span>

                                                                         {{#disposedDescription}}
                                                                             <span class=\"objectstatus sold phs pvn\">
                                                                                 {{disposedDescription}}
                                                                             </span>
                                                                         {{/disposedDescription}}

                                                                         {{#topRowLeft}}
                                                                             <span class=\"objectstatus inactive phs pvn\">
                                                                                 {{topRowLeft.displayText}}
                                                                             </span>
                                                                         {{/topRowLeft}}
                                                                     </div>

                                                                     {{#titleRow}}<h3 class=\"t4 word-break mhn truncate\" style=\"white-space: nowrap;\">{{titleRow}}</h3>{{/titleRow}}
                                                                     {{^titleRow}}<h3 class=\"t4 word-break mhn\">Tittel mangler</h3>{{/titleRow}}

                                                                     <div class=\"relative flex justify-space-between\" data-automation-id=\"bottomRow1\">
                                                                         <div class=\"size2of5\">
                                                                             <div class=\"d1 r-mvm\">

                                                                                 {{#viewCounter}}
                                                                                     <svg id=\"eye\" viewBox=\"0 12 96 96\" width=\"18\" height=\"18\" class=\"valign-middle\">
                                                                                         <g fill=\"#9BA8B1\">
                                                                                             <path d=\"M48,20c21.15,0,34.502,19.998,38.998,28C82.494,56.016,69.145,76,48,76C26.853,76,13.503,56.118,9.003,48.149 C13.5,40.101,26.853,20,48,20 M48,12C16,12,0,48.166,0,48.166S16,84,48,84s48-36,48-36S80,12,48,12L48,12z\"/>
                                                                                             <path d=\"M48,40c4.411,0,8,3.589,8,8s-3.589,8-8,8s-8-3.589-8-8S43.589,40,48,40 M48,32c-8.836,0-16,7.164-16,16 c0,8.837,7.164,16,16,16c8.837,0,16-7.163,16-16C64,39.164,56.837,32,48,32L48,32z\"/>
                                                                                         </g>
                                                                                     </svg>

                                                                                     <span class=\"t5 licorice mvn\">
                                                                                         {{#viewCounter}}
                                                                                             {{viewCounter}}
                                                                                         {{/viewCounter}}

                                                                                         {{^viewCounter}}
                                                                                             0
                                                                                         {{/viewCounter}}
                                                                                     </span>
                                                                                 {{/viewCounter}}

                                                                             </div>
                                                                         </div>

                                                                         <div class=\"size1of5\">
                                                                             <div class=\"d1 r-mvm\">
                                                                                 {{#viewCounter}}
                                                                                     <svg id=\"icon-share-favorite-filled\" width=\"18\" height=\"18\" viewBox=\"0 5 30 30\" class=\"valign-middle\">
                                                                                         <g fill=\"#9BA8B1\">
                                                                                             <path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M14.3 8.3C10.508 4.197 4.2 7.42 4.2 13c0 5.208 6.66 9.656 9.7 11.3.77.413 1.385.378 2.2 0 2.865-1.333 9.7-5.694 9.7-11.3 0-5.56-6.36-8.907-10.1-4.7-.35.393-.997.434-1.4 0z\"/>
                                                                                         </g>
                                                                                     </svg>
                                                                                     <span class=\"t5 licorice mvn\">
                                                                                         {{#saveCounter}}
                                                                                             {{saveCounter}}
                                                                                         {{/saveCounter}}

                                                                                         {{^saveCounter}}
                                                                                             0
                                                                                         {{/saveCounter}}
                                                                                     </span>
                                                                                 {{/viewCounter}}
                                                                             </div>
                                                                         </div>

                                                                         <div class=\"size2of5\">
                                                                             <div class=\"d1  r-mvm fright\">
                                                                                 <span class=\"t5 licorice mvn\">
                                                                                     0
                                                                                 </span>
                                                                                 dager igjen
                                                                             </div>
                                                                         </div>
                                                                     </div>


                                                                     <div class=\"r-mts\">
                                                                         {{#editableInNewPlatform}}
                                                                             {{#classifiedAd}}
                                                                                 <input class=\"button small r-pas r-mrm\" type=\"button\" onclick=\"location.href='/innfinn/adselection/ad/{{adId}}';\" value=\"Legg ut paa nytt\"/>
                                                                                 <input class=\"button small r-pas\" type=\"button\" onclick=\"location.href='{{adUrl}}';\" value=\"Flere valg\"/>
                                                                             {{/classifiedAd}}
                                                                             {{^classifiedAd}}
                                                                                 <input class=\"button small r-pas\" type=\"button\" onclick=\"location.href='{{adUrl}}';\" value=\"Flere valg\"/>
                                                                             {{/classifiedAd}}
                                                                         {{/editableInNewPlatform}}

                                                                         {{^editableInNewPlatform}}
                                                                                 <input class=\"button small r-pas\" type=\"button\" onclick=\"location.href='{{adUrl}}';\" value=\"Flere valg\"/>
                                                                         {{/editableInNewPlatform}}
                                                                     </div>
                                                                 </div>

                                                             </div>
                                                         </div>
                                                     </div>
                                                 </div>
                                             {{/inactiveAds}}
                                             "]}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:data-template "login_box", :type "text/mustache"},
                                    :tag     :script,
                                    :content ["
                                                 <div class=\"display-table mtm\">
                                                 {{! Logg inn }}
                                                 <div class=\"display-cell rightify prl\">
                                                     <a data-automation-id=\"login-button\" data-controller=\"loginLinkValidation\" href=\"/loginForm.html?redirectTo={{currentPage}}\"
                                                        data-autofocus>
                                                         Logg inn
                                                     </a>
                                                 </div>

                                                 {{! Ny bruker }}
                                                 <div class=\"display-cell pll\">
                                                     <a data-controller=\"loginLinkValidation\" href=\"/loginForm.html?redirectTo={{currentPage}}\">
                                                         Ny bruker
                                                     </a>
                                                 </div>
                                             </div>

                                             {{#loginMessage}}
                                                 <p class=\"mhn centerify\">{{loginMessage}}</p>
                                             {{/loginMessage}}
                                             "]}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   nil,
                                    :tag     :script,
                                    :content ["
                                                 (function (w) {
                                                     var enabled = Boolean(false);
                                                     if (!enabled) {
                                                         return;
                                                     }
                                                     if (!w._trackJsErrorQueue) {
                                                         w._trackJsErrorQueue = [];
                                                         w.onerror = function (e) { w._trackJsErrorQueue.push(e); }
                                                     }
                                                     w.commonQueue = w.commonQueue || [];
                                                     w.commonQueue.push({
                                                         name: 'trackjs',
                                                         application: 'finn-mfinn'
                                                     });
                                                 }(window));
                                             "]}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:src         "https://static.finncdn.no/_c/polyfill/v1.3.0/polyfills.js",
                                              :crossorigin ""},
                                    :tag     :script,
                                    :content nil}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:defer       "",
                                              :src         "https://static.finncdn.no/_c/mfinn/static/dist/mfinn.a408ab8a.js",
                                              :crossorigin ""},
                                    :tag     :script,
                                    :content nil}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:src         "https://static.finncdn.no/_c/common-browserbundle/v1.6.6/main.min.js",
                                              :defer       "",
                                              :crossorigin ""},
                                    :tag     :script,
                                    :content nil}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:src "https://acdn.adnxs.com/ast/static/0.16.1/ast.js", :defer ""},
                                    :tag     :script,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:src "https://d3im43qa7l2icm.cloudfront.net/schad.js", :defer ""},
                                    :tag     :script,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:src   "https://sdk.pulse.schibsted.com/gdpr-transparency-apnxs/latest/gdpr-bundle.js",
                                              :defer ""},
                                    :tag     :script,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:src         "https://static.finncdn.no/_c/analytics/v22.0.0/analytics.min.js",
                                              :defer       "",
                                              :crossorigin ""},
                                    :tag     :script,
                                    :content nil}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:src "https://sdk.pulse.schibsted.com/pulse.min.js", :defer ""},
                                    :tag     :script,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:src "https://d57hyau7p492u.cloudfront.net/autoSegment.min.js", :defer ""},
                                    :tag     :script,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:src         "https://s372.meetrics.net/bb-mx/prime/mtrcs_164235.js?pjid=164235&cb=schFraudAuditCb&size=all",
                                              :defer       "",
                                              :crossorigin ""},
                                    :tag     :script,
                                    :content nil}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   {:src         "https://static.finncdn.no/_c/cookie-whitelist/v1.0.6/clean.min.js",
                                              :defer       "",
                                              :crossorigin ""},
                                    :tag     :script,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:defer "",
                                              :src   "https://static.finncdn.no/_c/mfinn/static/dist/reactEntryPoint.82634f7f.js"},
                                    :tag     :script,
                                    :content nil}
                                   "\n"
                                   {:type    :element,
                                    :attrs   {:defer "", :src "https://www.googletagmanager.com/gtag/js?id=AW-1050677447"},
                                    :tag     :script,
                                    :content nil}
                                   "\n\n"
                                   {:type    :element,
                                    :attrs   nil,
                                    :tag     :noscript,
                                    :content ["\n"
                                              {:type    :element,
                                               :attrs   {:class "bg-cherry milk",
                                                         :style "position: fixed; bottom: 0; z-index: 2;"},
                                               :tag     :div,
                                               :content ["\n"
                                                         {:type    :element,
                                                          :attrs   nil,
                                                          :tag     :h2,
                                                          :content ["Velkommen til FINN.no"]}
                                                         "\n"
                                                         {:type    :element,
                                                          :attrs   nil,
                                                          :tag     :p,
                                                          :content ["FINN.no trenger JavaScript for aa virke. Vennligst slaa paa JavaScript i nettleseren og prov igjen."]}
                                                         "\n"]}
                                              "\n"]}
                                   "\n"
                                   "\n"
                                   "\n"]}]}]}
  )
