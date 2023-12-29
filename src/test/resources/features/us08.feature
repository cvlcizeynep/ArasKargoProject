@US08
  Feature:Kullanıcı Müşteri Hizmetleri Geri Bildirim Formu Bireysel sekmesi drop downdaki elementleri kullanabilmeli

  Background: us08

  Given Kullanici aras kargo sayfa url'sine gider
  When Kullanici ekrandaki bilgilendirme yazisini kapatir
  Then Kullanici musteri iliskileri sekmesine gelir ve acilan drop down'dan geri bildirim formuna tiklar
  Then Kullanici bireysel hizmetler alaninda kategori sekmesini tiklar

    @US08_TC01
    Scenario:Kullanıcı bireysel sekmesinde drop downdaki bilgi butonunu kullanabilmeli
      And Kullanici bilgi butonunu tiklar ve kullanilabildigini dogrular

    @US08_TC02
    Scenario:Kullanıcı bireysel sekmesinde drop downdaki islem-talep butonunu kullanabilmeli
      And Kullanici islem-talep butonunu tiklar ve kullanilabildigini dogrular

    @US08_TC03
    Scenario:Kullanıcı bireysel sekmesinde drop downdaki oneri butonunu kullanabilmeli
      And Kullanici oneri butonunu tiklar ve kullanilabildigini dogrular

    @US08_TC04
    Scenario:Kullanıcı bireysel sekmesinde drop downdaki sikayet-problem butonunu kullanabilmeli
      And Kullanici sikayet-problem butonunu tiklar ve kullanilabildigini dogrular

    @US08_TC05
    Scenario:Kullanıcı bireysel sekmesinde drop downdaki tesekkurler butonunu kullanabilmeli
      And Kullanici tesekkurler butonunu tiklar ve kullanilabildigini dogrular
