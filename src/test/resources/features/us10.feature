@mkdss
Feature: US_10

  Scenario: TC_01
    Given Kullanici siteye gider
    When Sayfanın header kısmındaki Kariyer linkine hover yapar
    And Acılan dropdown menuden Gelecegin Bizde Onem Tasir linkine tıklar
    Then Aras Kargo İsbasvurulari basligi altındaki butonların tıklanabilir oldugunu dogrular