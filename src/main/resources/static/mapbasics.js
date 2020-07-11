
var myMap;
var latGlobal;
var lonGlobal;

function eventFunc(city) {
console.log(city);
}
function showUserInfo(lat, lon) {
latGlobal = lat;
lonGlobal = lon;
    console.log("user info " + lat + ", " + lon)
    $('#myModal55').modal({backdrop: true});
}
// Дождёмся загрузки API и готовности DOM.
//ymaps.ready(init);

//$('#myModal').modal('init')
$('#myModal55').on('shown.bs.modal',init)

/*$(window).on('click', function(e) {
  // обработка события click...
  console.log('Нажата кнопка: ' + e.which); //1 - левая кнопка, 2 - средняя кнопка, 3 - правая
  console.log('Координаты курсора: x = ' + e.pageX + ' ; y = ' + e.pageY);
});*/

$('#City5').on('click', function(e) {
  // обработка события click...
  console.log('Нажата кнопкаqqqqq: ' + e.which); //1 - левая кнопка, 2 - средняя кнопка, 3 - правая
  console.log('Координаты курсора: x = ' + e.pageX + ' ; y = ' + e.pageY);
});
function init () {
    document.getElementById('map-canvas-modal').innerHTML = "";
    // Создание экземпляра карты и его привязка к контейнеру с
    // заданным id ("map").
    myMap = new ymaps.Map('map-canvas-modal', {
        // При инициализации карты обязательно нужно указать
        // её центр и коэффициент масштабирования.
        center: [latGlobal, lonGlobal], // Москва
        zoom: 7
    }, {
        searchControlProvider: 'yandex#search'
    });

    myMap.geoObjects
        .add(new ymaps.Placemark([latGlobal, lonGlobal], {
            balloonContent: 'цвет <strong>воды пляжа бонди</strong>'
        }, {
            preset: 'islands#icon',
            iconColor: '#0095b6'
        }))

/*    document.getElementById('destroyButton').onclick = function () {
        // Для уничтожения используется метод destroy.
        myMap.destroy();
    };*/

}

/*myPieChart = new ymaps.Placemark([
              55.847, 37.6
          ], {
              // Данные для построения диаграммы.
              data: [
                  {weight: 8, color: '#0E4779'},
                  {weight: 6, color: '#1E98FF'},
                  {weight: 4, color: '#82CDFF'}
              ],
              iconCaption: "Диаграмма"
          }, {
              // Зададим произвольный макет метки.
              iconLayout: 'default#pieChart',
              // Радиус диаграммы в пикселях.
              iconPieChartRadius: 30,
              // Радиус центральной части макета.
              iconPieChartCoreRadius: 10,
              // Стиль заливки центральной части.
              iconPieChartCoreFillStyle: '#ffffff',
              // Cтиль линий-разделителей секторов и внешней обводки диаграммы.
              iconPieChartStrokeStyle: '#ffffff',
              // Ширина линий-разделителей секторов и внешней обводки диаграммы.
              iconPieChartStrokeWidth: 3,
              // Максимальная ширина подписи метки.
              iconPieChartCaptionMaxWidth: 200
          });
*/