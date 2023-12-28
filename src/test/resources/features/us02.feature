@mkdds
Feature: US_02

  Scenario: TC_01
    Given Kullanici siteye gider
    When Sayfanın header kısmındaki Hizmetlerimiz linkine hover yapar
    And Acılan dropdown menude  Ambalaj urunlerimiz linkine tıklar
    Then Ambalaj fiyatları butonunun goruldugunu dogrular
