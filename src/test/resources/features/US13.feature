Feature: Kullanici Surdurulebilirlik sekmesindeki Kalite Yonetim Sistemi belgeleri goruntuleyebilmeli.

  Background: Ortak Step
    Given Kullanici gecerli Web Sayfasina Gider
    Then  Kullanici Surdurulebilirlik Tiklar
    And  Kullanici Kalite Yonetim Sistemi Tiklar

  Scenario:TC01 Kullanici Kalite Yonetim SistemiBilgi Guvenligi Yonetim Sistemi  Ulasabilmeli
    Given Kullanici Mukemmellikte Kararlılık Tiklar
    Then Kullanici Mükemmellikte Belgesini Dogrular

  Scenario:TC02 Kullanici Kalite Yonetim Sistemi Hizmet Yeterlilik Ulasabilmeli
    Given Kullanici Hizmet Yeterlilik BelgesiTiklar
    Then Kullanici Hizmet Yeterlilik Belgesi Belgesini Dogrular

  Scenario:TC03 Kullanici Kalite Yönetim Sistemi Türkiye Mukemmellik Odulu Ulasabilmeli
    Given Kullanici Türkiye Mukemmellik Odulu Tiklar
    Then Kullanici Türkiye Mükemmellik Odulu Belgesini Dogrular

  Scenario:TC04 Kullanici Kalite Yonetim Sistemi Bilgi Guvenlıgı Yonetim Sistemi Belgesi Ulasabilmeli
    Given Kullanici Bilgi Guvenlıgı Yonetim Sistemi Belgesi Tiklar
    Then Kullanici Bilgi Guvenlıgı Yonetim Sistemi Belgesi Dogrular

  Scenario:TC05 Kullanici Kalite Yonetim Sistemi Mükemmellikte Yetkinlik uc Yıldız Ulaşabilmeli
    Given Kullanici Mükemmellikte Yetkinlik uc Yıldız Tiklar
    Then Kullanici Mükemmellikte Yetkinlik uc Yıldız Belgesini Dogrular

  Scenario:TC06 Kullanici Kalite Yonetim Sistemi Mükemmellikte Yetkinlik dort Yıldız Ulaşabilmeli
    Given Kullanici Mükemmellikte Yetkinlik dort Yıldız Tiklar
    Then Kullanici Mükemmellikte Yetkinlik dort Yıldız Belgesini Dogrular

  Scenario:TC07 Kullanici Kalite Yonetim Sistemi Mükemmellikte Yetkinlik bes Yıldız Ulaşabilmeli
    Given Kullanici Mükemmellikte Yetkinlik bes Yıldız Tiklar
    Then Kullanici Mükemmellikte Yetkinlik bes Yıldız Belgesini Dogrular

  Scenario:TC08 Kullanici Kalite Yonetim Sistemi Kalite Yönetim Sistemi Belgesi Ulaşabilmeli
    Given KullaniciKalite Yönetim Sistemi Belgesi Tiklar
    Then Kullanici Kalite Yönetim Sistemi  Belgesini Dogrular

  Scenario:TC09 Kullanici Kalite Yonetim Sistemi Müşteri Memnuniyeti Yönetim Sistemi Belgesi Ulaşabilmeli
    Given Kullanici Müşteri Memnuniyeti Yönetim Sistemi Belgesi Tiklar
    Then Kullanici Müşteri Memnuniyeti Yönetim Sistemi Belgesini Dogrular

  Scenario:TC10 Kullanici Kalite Yonetim Sistemi Çevre Yönetim Sistemi Belgesi Ulaşabilmeli
    Given Kullanici Çevre Yönetim Sistemi Belgesi Tiklar
    Then Kullanici Çevre Yönetim Sistemi  Belgesini Dogrular

  Scenario:TC11 Kullanici Kalite Yonetim Sistemi İş Sağlığı ve Güvenliği Yönetim Sistemi Belgesi Ulaşabilmeli
    Given Kullanici İş Sağlığı ve Güvenliği Yönetim Sistemi Belgesi Tiklar
    Then Kullanici İş Sağlığı ve Güvenliği Yönetim Sistemi Belgesi Doğrular



