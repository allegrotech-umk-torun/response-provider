# response-provider
Aplikacja serwująca przykładowy response z konfigurowalnym opóźnieniem.

### Uruchomienie aplikacji:
./gradlew run

### Endpointy

* */response/{requestParam}* - zwraca odpowiedż w formacie:
```
{
"responseParam" : "{przekazana w zapytaniu wartość}",
"delay: ustawione opóżnienie odpowiedzi (domyślnie 50 ms)
}
```
* */setDelay/{delay}* - ustawia opóźnienie odpowiedzi na endpoincie */respone*. Maksynalnie 5000ms
