package com.wso2.choreospringboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/jwks")
    ResponseEntity<String> test(){

        return ResponseEntity.status(200)
                .contentType(MediaType.APPLICATION_JSON)
                .body(testText());
    }

    private static String testText(){
        return "{\n" +
                "  \"keys\" : [ {\n" +
                "    \"kid\" : \"7eJ8S_ZgvlYxFAFSghV9xMJROvk\",\n" +
                "    \"kty\" : \"RSA\",\n" +
                "    \"n\" : \"qLfocPSmvHU3el9p8lzqlIyDSLSM6JCu35ZnoamEpSEDYmtsHFZO9ptfVDuGJ-XlRuQE6SefdILKoGmU9KqSxgt09JyRvYntRUuPvo7tGQQugUP69KtDwVYSfyVe_hSJLzKW-Wsg9rz6lW0DA64jf9gWaoHWVweAEjwQQsNRYddKnc6GRwqOubvq3WxDPS2yaLlodlHcVdvR0AJA750ZqQh6urNSYB1xwu1a5IkxP5vtzsgMOb8hH8xXuKiXTjJ4GQ6Vat4go6odTXo8jc389IwS33okBQpn-fRULTHhgdoFgNfbux_gbKm5uCaRx3ghsb_xcS4erciTzigSk_lARQ\",\n" +
                "    \"e\" : \"AQAB\",\n" +
                "    \"use\" : \"sig\",\n" +
                "    \"x5c\" : [ \"MIIFLTCCBBWgAwIBAgIEWcbiiDANBgkqhkiG9w0BAQsFADBTMQswCQYDVQQGEwJHQjEUMBIGA1UEChMLT3BlbkJhbmtpbmcxLjAsBgNVBAMTJU9wZW5CYW5raW5nIFByZS1Qcm9kdWN0aW9uIElzc3VpbmcgQ0EwHhcNMjMxMTE1MDUxMDA4WhcNMjQxMjE1MDU0MDA4WjBhMQswCQYDVQQGEwJHQjEUMBIGA1UEChMLT3BlbkJhbmtpbmcxGzAZBgNVBAsTEjAwMTU4MDAwMDFIUVFyWkFBWDEfMB0GA1UEAxMWakZRdVE0ZVFiTkNNU3FkQ29nMjFuRjCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAKi36HD0prx1N3pfafJc6pSMg0i0jOiQrt+WZ6GphKUhA2JrbBxWTvabX1Q7hifl5UbkBOknn3SCyqBplPSqksYLdPSckb2J7UVLj76O7RkELoFD+vSrQ8FWEn8lXv4UiS8ylvlrIPa8+pVtAwOuI3/YFmqB1lcHgBI8EELDUWHXSp3OhkcKjrm76t1sQz0tsmi5aHZR3FXb0dACQO+dGakIerqzUmAdccLtWuSJMT+b7c7IDDm/IR/MV7iol04yeBkOlWreIKOqHU16PI3N/PSMEt96JAUKZ/n0VC0x4YHaBYDX27sf4Gypubgmkcd4IbG/8XEuHq3Ik84oEpP5QEUCAwEAAaOCAfkwggH1MA4GA1UdDwEB/wQEAwIGwDAVBgNVHSUEDjAMBgorBgEEAYI3CgMMMIHgBgNVHSAEgdgwgdUwgdIGCysGAQQBqHWBBgFkMIHCMCoGCCsGAQUFBwIBFh5odHRwOi8vb2IudHJ1c3Rpcy5jb20vcG9saWNpZXMwgZMGCCsGAQUFBwICMIGGDIGDVXNlIG9mIHRoaXMgQ2VydGlmaWNhdGUgY29uc3RpdHV0ZXMgYWNjZXB0YW5jZSBvZiB0aGUgT3BlbkJhbmtpbmcgUm9vdCBDQSBDZXJ0aWZpY2F0aW9uIFBvbGljaWVzIGFuZCBDZXJ0aWZpY2F0ZSBQcmFjdGljZSBTdGF0ZW1lbnQwbQYIKwYBBQUHAQEEYTBfMCYGCCsGAQUFBzABhhpodHRwOi8vb2IudHJ1c3Rpcy5jb20vb2NzcDA1BggrBgEFBQcwAoYpaHR0cDovL29iLnRydXN0aXMuY29tL29iX3BwX2lzc3VpbmdjYS5jcnQwOgYDVR0fBDMwMTAvoC2gK4YpaHR0cDovL29iLnRydXN0aXMuY29tL29iX3BwX2lzc3VpbmdjYS5jcmwwHwYDVR0jBBgwFoAUUHORxiFy03f0/gASBoFceXluP1AwHQYDVR0OBBYEFKjCef/JxD+ND9eSb7hQlmEhSxUqMA0GCSqGSIb3DQEBCwUAA4IBAQCnKH9FdLmJMruX2qfbrpT0qaV8bP7xa9UDRYSMsAWC2kqCxs8CJmARt5+xsxBW6P65+mkLS2vXgQl7J8RTMiQVnHJvvNaldYnV6odsYOqvv+vGib8Qe0gKWSjih+Gd1Ct4UQFtn6P3ph+6OBB0OieZb7DYXqPJrX5UlG7K2fQ40MdFgBdeQZ3iNkXi43UIrQ5cF4cjYavmEFRmYeHya8AKfNCiWly15mNazW/X6SWf7pz+yk/l+gBv0wm3QT7ANXGf8izgoh6T5fmixPXSbdn8RUIV0kXp2TRRZ+CYUWBPJc3PvRXiiEEo2eHLXfEHG2jzrt1iKnjk6hzuC1hUzK0t\" ],\n" +
                "    \"x5t\" : \"ov8shjyB_TDmFYr4e-1DQThUMSs=\",\n" +
                "    \"x5u\" : \"https://keystore.openbankingtest.org.uk/0015800001HQQrZAAX/7eJ8S_ZgvlYxFAFSghV9xMJROvk.pem\",\n" +
                "    \"x5t#S256\" : \"xZbIpA5FEBBmyOTOZTXH4v4URSMckOAxDMNWrFRtqGE=\"\n" +
                "  }, {\n" +
                "    \"kid\" : \"7x6UrhU-Yj1Aa9Ird03JJCcDurs\",\n" +
                "    \"kty\" : \"RSA\",\n" +
                "    \"n\" : \"myUaNObS1bCecqALtY2pRJg3FuVRGQnKgPlS5KbOmwzmeVQEDFjEGDO1OjTrYskQvNRPMD_2SAsgwyCP7AbU5LjvlAKB7KgObB_RI-4VEGXQbQCPEC8nPOzZqKPPGJhFspRriCY7Uo9TdeXPz2aLyXCNNmXG0aTcAHAEbh_mdrlNju5kyWBY9cOdODsJzUfiasxsQWRRpeZvpmGEa2nQkvTj7gunXpBauCIeuWin4_xt36nCaY6Yu6CVMgSH6_33eP7u_wFdip2ZhDeeiI6Er3KcU8PUDu6uubvU-CS6r5aTkcK8yIErvNnhKf0UOi_KQMplMVgyWhUNcuGZ8NCuZw\",\n" +
                "    \"e\" : \"AQAB\",\n" +
                "    \"use\" : \"tls\",\n" +
                "    \"x5c\" : [ \"MIIFODCCBCCgAwIBAgIEWcbiiTANBgkqhkiG9w0BAQsFADBTMQswCQYDVQQGEwJHQjEUMBIGA1UEChMLT3BlbkJhbmtpbmcxLjAsBgNVBAMTJU9wZW5CYW5raW5nIFByZS1Qcm9kdWN0aW9uIElzc3VpbmcgQ0EwHhcNMjMxMTE1MDUxMDMxWhcNMjQxMjE1MDU0MDMxWjBhMQswCQYDVQQGEwJHQjEUMBIGA1UEChMLT3BlbkJhbmtpbmcxGzAZBgNVBAsTEjAwMTU4MDAwMDFIUVFyWkFBWDEfMB0GA1UEAxMWakZRdVE0ZVFiTkNNU3FkQ29nMjFuRjCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAJslGjTm0tWwnnKgC7WNqUSYNxblURkJyoD5UuSmzpsM5nlUBAxYxBgztTo062LJELzUTzA/9kgLIMMgj+wG1OS475QCgeyoDmwf0SPuFRBl0G0AjxAvJzzs2aijzxiYRbKUa4gmO1KPU3Xlz89mi8lwjTZlxtGk3ABwBG4f5na5TY7uZMlgWPXDnTg7Cc1H4mrMbEFkUaXmb6ZhhGtp0JL04+4Lp16QWrgiHrlop+P8bd+pwmmOmLuglTIEh+v993j+7v8BXYqdmYQ3noiOhK9ynFPD1A7urrm71Pgkuq+Wk5HCvMiBK7zZ4Sn9FDovykDKZTFYMloVDXLhmfDQrmcCAwEAAaOCAgQwggIAMA4GA1UdDwEB/wQEAwIHgDAgBgNVHSUBAf8EFjAUBggrBgEFBQcDAQYIKwYBBQUHAwIwgeAGA1UdIASB2DCB1TCB0gYLKwYBBAGodYEGAWQwgcIwKgYIKwYBBQUHAgEWHmh0dHA6Ly9vYi50cnVzdGlzLmNvbS9wb2xpY2llczCBkwYIKwYBBQUHAgIwgYYMgYNVc2Ugb2YgdGhpcyBDZXJ0aWZpY2F0ZSBjb25zdGl0dXRlcyBhY2NlcHRhbmNlIG9mIHRoZSBPcGVuQmFua2luZyBSb290IENBIENlcnRpZmljYXRpb24gUG9saWNpZXMgYW5kIENlcnRpZmljYXRlIFByYWN0aWNlIFN0YXRlbWVudDBtBggrBgEFBQcBAQRhMF8wJgYIKwYBBQUHMAGGGmh0dHA6Ly9vYi50cnVzdGlzLmNvbS9vY3NwMDUGCCsGAQUFBzAChilodHRwOi8vb2IudHJ1c3Rpcy5jb20vb2JfcHBfaXNzdWluZ2NhLmNydDA6BgNVHR8EMzAxMC+gLaArhilodHRwOi8vb2IudHJ1c3Rpcy5jb20vb2JfcHBfaXNzdWluZ2NhLmNybDAfBgNVHSMEGDAWgBRQc5HGIXLTd/T+ABIGgVx5eW4/UDAdBgNVHQ4EFgQU7T6cMtCSQTT5JWW3O6vifRUSdpkwDQYJKoZIhvcNAQELBQADggEBAE9jrd/AE65vy3SEWdmFKPS4su7uEHy+KH18PETV6jMF2UFIJAOx7jl+5a3O66NkcpxFPeyvSuH+6tAAr2ZjpoQwtW9tZ9k2KSOdNOiJeQgjavwQC6t/BHI3yXWOIQm445BUN1cV9pagcRJjRyL3SPdHVoRfIbF7VI/+ULHwWdZYPXxtwUoda1mQFf6a+2lO4ziUHb3U8iD90FBURzID7WJ1ODSeB5zE/hG9Sxd9wlSXvl1oNmc/ha5oG/7rJpRqrx5Dcq3LEoX9iZZ3knHLkCm/abIQ7Nff8GQytuGhnGZxmGFYKDXdKElcl9dAlZ3bIK2I+I6jD2z2XvSfrhFyRjU=\" ],\n" +
                "    \"x5t\" : \"i_rXxQv8kzzoPawCeJN_KdafnDA=\",\n" +
                "    \"x5u\" : \"https://keystore.openbankingtest.org.uk/0015800001HQQrZAAX/7x6UrhU-Yj1Aa9Ird03JJCcDurs.pem\",\n" +
                "    \"x5t#S256\" : \"807-E8KgUMV6dRHTQi1_QYo5eyPvjmjbxCtunbFixV0=\"\n" +
                "  }, {\n" +
                "    \"kid\" : \"bF0SuWshrYIUtCYZxUkl8NHvXYA\",\n" +
                "    \"kty\" : \"RSA\",\n" +
                "    \"n\" : \"tytIHwuXNFmB1n_iE9gsnvFhGyb0BrtfepqpB09yDHE5JCvxdB71s-HV8FPOQntJ1q6EktNtEx5KTzYLicTeD1gUYdZaR1vMP3oKyeNi18tb6p3F5o6vroI2CbTbhwbQcKMMZssZi99WvjUJXVlyKMIXOySKazIhN59Zp5vJ-qNbb6aL9YYB2fUUhFRPGbtWuAzU_3iidalRbkSuyCA9VbWWlArNevRuXnGg5vmL8dGBGWFZbb3r6srmYzEOdmqE20kSHmaWl5meMvKXbjtcTC_A7fc6m5tAQnzWTjb7QnXAkizi7zQYVbzXq25nOp250RL8JAMWlUjl_U4LiE-5lw\",\n" +
                "    \"e\" : \"AQAB\",\n" +
                "    \"use\" : \"enc\"\n" +
                "  }, {\n" +
                "    \"kid\" : \"F_EvWpIdiNOODrBOmnIdGf8ygX0\",\n" +
                "    \"kty\" : \"RSA\",\n" +
                "    \"n\" : \"sz4wVc3C3Yoiko9xvUb-p8wDRn08TvnYLEjCSEXcSyEc94aVhK0vStwvFwEuPSDbw3y568DWtX-4kFDo7KiQxcriEnKCHP-r20VM916vX7v3BfNI1yINDYvqEzlU0meFSaOUKvcTYT3mNwHVUqEy9ci_XAFtKA_qZ4ShHoZNvqDxJu4_VoSZE1kURK-ngAulZ1H7mDaBcQMTOg1jyCrp2YiBXTaZhngt_uG3jqw9BaCCzTMkm-EkcEcAhZ3EVaJPAqiogHqyw7-0eKByYOYqm3yI2xTimIpH3eAsR9b8uyME7xUL0fNZd1w3J2yPSgnNZq7TBStakKI0E0-tgDkuFQ\",\n" +
                "    \"e\" : \"AQAB\",\n" +
                "    \"use\" : \"sig\"\n" +
                "  }, {\n" +
                "    \"kid\" : \"Fqyu8Q-yigN8cJFZPQo65Qq1b-U\",\n" +
                "    \"kty\" : \"RSA\",\n" +
                "    \"n\" : \"j6PrIn1KSnduziwbfXIRRjeT9rRZF9zqUQyxi_zLIPH-t6QCQqPTKTxMDGL5Zk7DEegdQi8bVPZa4T4XyrMbrhnQGz18Oa--D2lJyd7Hu999aR9jiaKv37wqj1Su6e-SBXPKIYhXRO409siBBpB041TZhGLeFnVd_jBbfPZ7TISAWlO44kmApIXV-_dQEuxlqME63vGkoHrSpH3nnIpZVHaNZ4lWktZZbgJYIkyj4SoeYjwtH5NzebAlSiNJGn6nsns5WwUrqw562QUFXpXRWcwsLQOIZrTVRr7wQjhmNKrxHjmvosXJAlDcmapOfv0lG9tktPYhpnQkuupXYEVDaw\",\n" +
                "    \"e\" : \"AQAB\",\n" +
                "    \"use\" : \"enc\"\n" +
                "  }, {\n" +
                "    \"kid\" : \"h3ZCF0VrzgXgnHCqbHbKXzzfjTg\",\n" +
                "    \"kty\" : \"RSA\",\n" +
                "    \"n\" : \"rALMOZgzCl6eOQtZQxh1xPzY4fx_JAdJz0Hntc4I0k_xUhp1BENill4Ggn8m25AYdRG9xfmuRRWeFtUpwISvZrilXQny1CEUDvhxVA8xR8BLkXDeKsSOU7gKfQtaCdIFKH-h2Y80XvixIO9rEw8RK_FzhI1a040NC-xw1A0CLR_U0DaBYxDT3EYlojy7hmmb04MVVm6Owu9EauGn4PmDUJmNdF25YBKtXu34VeBN60TW16wpVHJW-w52fD1wz9o9z0AZp2NbTA54w46a_SakSZSshZmcIozHBoRHZewiOSKa37xOzmsMf80SQ0xZiw2wj1CSByH7GS8prsnUfJVCfw\",\n" +
                "    \"e\" : \"AQAB\",\n" +
                "    \"use\" : \"sig\",\n" +
                "    \"x5c\" : [ \"MIIFLTCCBBWgAwIBAgIEWca5LjANBgkqhkiG9w0BAQsFADBTMQswCQYDVQQGEwJHQjEUMBIGA1UEChMLT3BlbkJhbmtpbmcxLjAsBgNVBAMTJU9wZW5CYW5raW5nIFByZS1Qcm9kdWN0aW9uIElzc3VpbmcgQ0EwHhcNMjMwNDE3MDQ1NjM0WhcNMjQwNTE3MDUyNjM0WjBhMQswCQYDVQQGEwJHQjEUMBIGA1UEChMLT3BlbkJhbmtpbmcxGzAZBgNVBAsTEjAwMTU4MDAwMDFIUVFyWkFBWDEfMB0GA1UEAxMWb1E0S29hYXZwT3VvRTdydlFzWkVPVjCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAKwCzDmYMwpenjkLWUMYdcT82OH8fyQHSc9B57XOCNJP8VIadQRDYpZeBoJ/JtuQGHURvcX5rkUVnhbVKcCEr2a4pV0J8tQhFA74cVQPMUfAS5Fw3irEjlO4Cn0LWgnSBSh/odmPNF74sSDvaxMPESvxc4SNWtONDQvscNQNAi0f1NA2gWMQ09xGJaI8u4Zpm9ODFVZujsLvRGrhp+D5g1CZjXRduWASrV7t+FXgTetE1tesKVRyVvsOdnw9cM/aPc9AGadjW0wOeMOOmv0mpEmUrIWZnCKMxwaER2XsIjkimt+8Ts5rDH/NEkNMWYsNsI9Qkgch+xkvKa7J1HyVQn8CAwEAAaOCAfkwggH1MA4GA1UdDwEB/wQEAwIGwDAVBgNVHSUEDjAMBgorBgEEAYI3CgMMMIHgBgNVHSAEgdgwgdUwgdIGCysGAQQBqHWBBgFkMIHCMCoGCCsGAQUFBwIBFh5odHRwOi8vb2IudHJ1c3Rpcy5jb20vcG9saWNpZXMwgZMGCCsGAQUFBwICMIGGDIGDVXNlIG9mIHRoaXMgQ2VydGlmaWNhdGUgY29uc3RpdHV0ZXMgYWNjZXB0YW5jZSBvZiB0aGUgT3BlbkJhbmtpbmcgUm9vdCBDQSBDZXJ0aWZpY2F0aW9uIFBvbGljaWVzIGFuZCBDZXJ0aWZpY2F0ZSBQcmFjdGljZSBTdGF0ZW1lbnQwbQYIKwYBBQUHAQEEYTBfMCYGCCsGAQUFBzABhhpodHRwOi8vb2IudHJ1c3Rpcy5jb20vb2NzcDA1BggrBgEFBQcwAoYpaHR0cDovL29iLnRydXN0aXMuY29tL29iX3BwX2lzc3VpbmdjYS5jcnQwOgYDVR0fBDMwMTAvoC2gK4YpaHR0cDovL29iLnRydXN0aXMuY29tL29iX3BwX2lzc3VpbmdjYS5jcmwwHwYDVR0jBBgwFoAUUHORxiFy03f0/gASBoFceXluP1AwHQYDVR0OBBYEFFbNRf2on1lD/kZMxwUqtGQB0O7jMA0GCSqGSIb3DQEBCwUAA4IBAQBFNMFwWVRKcv7TSoHlDsG6bKN/TP0JEzy5cZkhqqpcupV+4w+Yhw3IqJvV08SFRKSwPshEMbTIoAtcxVGz9FAtV3TixTl9BXRdXImLRBsXFWfFSzeNYL3gyhdwfItoyRWVMEfHC4KsOGQ7DNl90mUaOkB4vGZTTLV8PQKhkRVPh33pPRdxi+d3PNFzOhed8hAB4anb/ckio2np7JunCOrU2kYEW2yc7DTJc+grCD/T+eJzf3AXeWb+fIVyc+luabxJFKsfblcoSXdIRj3fKjGMOuvPvd5SzS4tU1uzl2OOzPcowKfDtBAeJZ4Gmdj+RnbmH8QsHTdOJ8gxMXL9rKfF\" ],\n" +
                "    \"x5t\" : \"SVWos4zW3AzZRS8yHo4_TIbBKfA=\",\n" +
                "    \"x5u\" : \"https://keystore.openbankingtest.org.uk/0015800001HQQrZAAX/h3ZCF0VrzgXgnHCqbHbKXzzfjTg.pem\",\n" +
                "    \"x5t#S256\" : \"WRP2_90JYT8BrDoa8m2fTSUDj8Is1hLm043w45uYIH0=\"\n" +
                "  }, {\n" +
                "    \"kid\" : \"pfOrs1DQuXRce1QGUY2HJjhSQnw\",\n" +
                "    \"kty\" : \"RSA\",\n" +
                "    \"n\" : \"vYCysHIdIQLpf__EXAGd7gK2tTVtickci-hY4oBJlxFnfMLO1gskv7ukrjUhYSNqXR7jnNh0tLqD0ylfYJkpRwatc7TRdB5c7Fruv4gEb3NN9BhnV5LYNxHMG2TYq-QF0Ln_WNObCptSMO9xeLtbNfTWMZ8lZVVoURiDegBLuSdKdSSDTjmSylXHBFKxuW6uUVbIbh1oUcyVYi1qr1GgaQ95cA3dWY67EMv2y-DWLZWfNaKyi2IH433vUwAfOaqc8PNf_L4TUBdbf13qpmnnyLllmmJHPL2FKHSEXLDbcJureJ2AmXxZmwAA7RfhPYEr16yBGTsUkDOfzjLZdXyimQ\",\n" +
                "    \"e\" : \"AQAB\",\n" +
                "    \"use\" : \"enc\"\n" +
                "  }, {\n" +
                "    \"kid\" : \"Pn7wWY8GW2wX4sT8rKVgUSR0WJU\",\n" +
                "    \"kty\" : \"RSA\",\n" +
                "    \"n\" : \"2-1zVMBojig-vQ--UopUalovrUQxHgSAJ6gwOJOH-mDCEXUly0KGxu60UfiTpLm0tf6UH74fNVH01DqfP6DL9T17pk_RHDfALdSFRMU37iKZNlOB6uYrEODgL3-crOvgengMWNs9YoQR5gHF3uJJEczJh8PihRfbJOanjsHMdBwuGfDEMh38rQ6P4LEeTc8MtdR2qNm3R3DfFJZu0GrR5g-xdSFZ4XV1ik8Ad4lGjATK-84clJmwsgjGLHvP57R6BvJjj8K8nPfQ2Cxd9der_KVV6W5QMVokCk_fcAyfvrOAHILcYOC-NeB_EiIqEm4dxNH9RVzRf_7gxZNiMq6Q8Q\",\n" +
                "    \"e\" : \"AQAB\",\n" +
                "    \"use\" : \"enc\"\n" +
                "  }, {\n" +
                "    \"kid\" : \"PYferzXAdnBJEkd4hK1Xm5rL1Zs\",\n" +
                "    \"kty\" : \"RSA\",\n" +
                "    \"n\" : \"0imlZkCwGNqtWu8Xj4ysE_cfGpEc_0oe1J8n9fZfwOz1FhLb4aKNdnDm1D9wRmBuV5KeSBgh-a_XEfGqIlj79jBVFuAB2OQ0E6ub9v2YPogu54k89ix6NbujujHiRxO0UOIcBVVSWWXD98XhE6JpTaSJfv5bs1EW1BIs29YpINi3Fzo8nWok7_9-I_McyCL2dkT1jWmoaFYmJQiysRGTNXHCf7phPko_k_1gEPvfLgMUxL0wAR_gG47pMvtr1ZIHh047ac1Blgtxw0q8PMAO1_11eNKjC8QvWKYa9PCYl1uXN9rj2a6k3FeyK6IxCYgLwYvV_7vWWX50r6vcSuvVTw\",\n" +
                "    \"e\" : \"AQAB\",\n" +
                "    \"use\" : \"sig\"\n" +
                "  }, {\n" +
                "    \"kid\" : \"qGSq26Iezcl8OuSDV89JiKAYDuY\",\n" +
                "    \"kty\" : \"RSA\",\n" +
                "    \"n\" : \"uelFrqWTaddV1c96pcme8lbaJ5MAHdoqEkFcc9Z7ICQC4y5k2QIbvnsIO3h301FZtejI47Vsd7ikrg3VvDEDM9_qODxl_--E6g58AatVLYalUcZo04dxWjilEj3Cd8Mdsoz2vGUGi7Jc7UnZHJckcRo-83P46P3SOtEDkEdtH6wVQzWAYBP2CkuOPZphnt9d3trtznjDdt0TPc54RUNaPjn_4CURH9Dc6bQ60TuObT2Ss2dbkJLvWcKEsPi3OGt8FxCW8HagokFnf8y0xIBagtghdCcWjbvEMDsfOe8lcp7H4u6cluJ9bu9w6_MvIfKi16Sz8n9vws2Gei8ivudaCQ\",\n" +
                "    \"e\" : \"AQAB\",\n" +
                "    \"use\" : \"enc\"\n" +
                "  }, {\n" +
                "    \"kid\" : \"_R4CIMA-v0c1SRr9eHzVC-PWj8Y\",\n" +
                "    \"kty\" : \"RSA\",\n" +
                "    \"n\" : \"yUSmfxrRo3JIL4Ivvx_M-_fWiU-V63lw4S1TLr0zguI4ZBcCC8ivg8V7O-VWGd69W21V0afYmBs0rVOoz30G4VChu84INM3izd-6us3GcNaIUyXMaXv75v4Cuj0zcdoaR0AGKflJAwuLTDZlkBpqFT6QDZ90kCOxxjAu0I3maL_4X6XeMm9StHbK9lsmHU7jXhk980qQEextjbbsA3xjXsIVmi7xigMG2CTrmegEP233JuGJOi57R7gVpi0xR66firAw7OXY4fl7R1QKzX5iibDDQqYOkxGk5MPP0dKPmxDezQvlLC8Cynh7x9QD_bagPIdtJlijw4HCHuehfVCsQQ\",\n" +
                "    \"e\" : \"AQAB\",\n" +
                "    \"use\" : \"enc\"\n" +
                "  }, {\n" +
                "    \"kid\" : \"TKHsPIIGBAJoSqEEgAfLWK3iCMs\",\n" +
                "    \"kty\" : \"RSA\",\n" +
                "    \"n\" : \"l4xpanObBhnblwMctIRaFzBpr8kleDC6lkmJ8HKFpqjyb8eHHw9mlc5fPsZx-I1WbPfDVwAVe9-s2HgDutza-On2yE1DptCds4pWOg36s3GyRiPGm8s6WUJRqKLmSN1EXmvRgT3u3eEfsZ0BNPnomz1qibKRt5ih0bW83h4NyACufV87ur7r7QTDYyVrlf5P9-x-77Xi1cwvHsABBILMZ-xicmnp8IlDi6TV3maVhZ35wzaBZ_V5Dmwd4vUr0H5zOizns0WGxVQG88I8uatq1qePvy03w7rM7ECzVQRyR_7PWssrcPY0Kq_0Wd8HuxosqGnny9CqhGc6Jb6WvVnhuw\",\n" +
                "    \"e\" : \"AQAB\",\n" +
                "    \"use\" : \"tls\",\n" +
                "    \"x5c\" : [ \"MIIFODCCBCCgAwIBAgIEWca5LzANBgkqhkiG9w0BAQsFADBTMQswCQYDVQQGEwJHQjEUMBIGA1UEChMLT3BlbkJhbmtpbmcxLjAsBgNVBAMTJU9wZW5CYW5raW5nIFByZS1Qcm9kdWN0aW9uIElzc3VpbmcgQ0EwHhcNMjMwNDE3MDQ1ODE2WhcNMjQwNTE3MDUyODE2WjBhMQswCQYDVQQGEwJHQjEUMBIGA1UEChMLT3BlbkJhbmtpbmcxGzAZBgNVBAsTEjAwMTU4MDAwMDFIUVFyWkFBWDEfMB0GA1UEAxMWb1E0S29hYXZwT3VvRTdydlFzWkVPVjCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAJeMaWpzmwYZ25cDHLSEWhcwaa/JJXgwupZJifByhaao8m/Hhx8PZpXOXz7GcfiNVmz3w1cAFXvfrNh4A7rc2vjp9shNQ6bQnbOKVjoN+rNxskYjxpvLOllCUaii5kjdRF5r0YE97t3hH7GdATT56Js9aomykbeYodG1vN4eDcgArn1fO7q+6+0Ew2Mla5X+T/fsfu+14tXMLx7AAQSCzGfsYnJp6fCJQ4uk1d5mlYWd+cM2gWf1eQ5sHeL1K9B+czos57NFhsVUBvPCPLmratanj78tN8O6zOxAs1UEckf+z1rLK3D2NCqv9FnfB7saLKhp58vQqoRnOiW+lr1Z4bsCAwEAAaOCAgQwggIAMA4GA1UdDwEB/wQEAwIHgDAgBgNVHSUBAf8EFjAUBggrBgEFBQcDAQYIKwYBBQUHAwIwgeAGA1UdIASB2DCB1TCB0gYLKwYBBAGodYEGAWQwgcIwKgYIKwYBBQUHAgEWHmh0dHA6Ly9vYi50cnVzdGlzLmNvbS9wb2xpY2llczCBkwYIKwYBBQUHAgIwgYYMgYNVc2Ugb2YgdGhpcyBDZXJ0aWZpY2F0ZSBjb25zdGl0dXRlcyBhY2NlcHRhbmNlIG9mIHRoZSBPcGVuQmFua2luZyBSb290IENBIENlcnRpZmljYXRpb24gUG9saWNpZXMgYW5kIENlcnRpZmljYXRlIFByYWN0aWNlIFN0YXRlbWVudDBtBggrBgEFBQcBAQRhMF8wJgYIKwYBBQUHMAGGGmh0dHA6Ly9vYi50cnVzdGlzLmNvbS9vY3NwMDUGCCsGAQUFBzAChilodHRwOi8vb2IudHJ1c3Rpcy5jb20vb2JfcHBfaXNzdWluZ2NhLmNydDA6BgNVHR8EMzAxMC+gLaArhilodHRwOi8vb2IudHJ1c3Rpcy5jb20vb2JfcHBfaXNzdWluZ2NhLmNybDAfBgNVHSMEGDAWgBRQc5HGIXLTd/T+ABIGgVx5eW4/UDAdBgNVHQ4EFgQUSoZfmnXGAPddPqfHWVOvkxD89MgwDQYJKoZIhvcNAQELBQADggEBABHzHOJzn4DPHay8xGzlWJIxxe+XsNtupR5V/ouEGCzJMUPmegYeK2Kiv+Z9nJKnbspgqLil52yauKWRmiXif4FWoOPRwspR9ijnynCgIp6z3EAOawbe28HkaGEfAi8PMqdNAYLKpXg35TUnbP+p2Q55Grq9EpSR2APQfJ4TjgLgKjqLRf/RjJAY9hJbQJIUl07esYf8hH7mX6uHDCywzic+UEQ3tUfo7PgWmnmtyUdFcW1qAl4P80a5fb8Wq0gNu6gN5tK2bg5TfSo3Gp2It8NVu/dY7q3ur7CAYTXrThjg4GXUQgVqYgV3pHbr1LTAiRtac7RBhMNPCklZA78RpTM=\" ],\n" +
                "    \"x5t\" : \"m9PZfscobhscXz8oFMGQ6CDsxh0=\",\n" +
                "    \"x5u\" : \"https://keystore.openbankingtest.org.uk/0015800001HQQrZAAX/TKHsPIIGBAJoSqEEgAfLWK3iCMs.pem\",\n" +
                "    \"x5t#S256\" : \"k0p--ML7nfkE2pULKryszJRBx2ThBMaxHgJOePosits=\"\n" +
                "  }, {\n" +
                "    \"kid\" : \"UcHC4dMOHmb7J7GNfCznWJfi0fI\",\n" +
                "    \"kty\" : \"RSA\",\n" +
                "    \"n\" : \"8-tiWOkWFr4Tlo2UG_ACR81qlTjZIjkSye0t16Z8pzEQj64TBfeUTxAdpaIKiBwL5BQQvg5qjNSmX6GmCuVb8UhvZEx4aO3Cy--P9BwtiRznjNOoG7-WBHQq1iJPSBRs7EgPn0qum2j1Xp-2gHHmTRSCw-3z0WS-Ln0IgrNo_rHmeLa812L8P5s_pEH1fwW3Tha01Jp8qGIrH88gYouGO7HV9C193gHEzgfLpCD6AL94EN08zIiV-5oQiM4R1g6pg4h5x36f_Y1ee5FTH_LdQ7IaczcyxmGSBQRKUYB03FZt5biS6ji4PdRShIWcAieT2b9LvGcS8ERi-LpJNV3PIw\",\n" +
                "    \"e\" : \"AQAB\",\n" +
                "    \"use\" : \"enc\"\n" +
                "  }, {\n" +
                "    \"kid\" : \"u_XAGF_C6ehevwr0udpSGThM8Co\",\n" +
                "    \"kty\" : \"RSA\",\n" +
                "    \"n\" : \"0cw7xXPJgtUyzjgIUTPI-j30lgYtQRVpPJXVkCEvBL8xsR6t6OL6DnaVZMd54VuUweg5vW0-oMhVhFkshbxRPXRDsBl0-wvUZegUyYmZ2vModazMlhAIbmZ6Xma2k15sURUWaVj4msfLrFrEML8CsHsxrhzc5lTDgtI3ZDq37pKv8CzDyzzxtdgSng-DJCb1Arg5MhFuPZ1vE1dh8nqALoS4zOr9tNIcZod9GUEaX1G22b0XDO2caj8ePer9Tem_GG0JmQJA29vJN3WdroHeyAKkqFqvmuCPYFfmv3du857N3hXoXxETX1dSLuWGob9-IArtstARg_n9vwaVeygIuQ\",\n" +
                "    \"e\" : \"AQAB\",\n" +
                "    \"use\" : \"sig\"\n" +
                "  } ]\n" +
                "}";
    }

}
