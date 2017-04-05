var myApp = angular.module('friedBallStandApp', [])

myApp.controller('OrderCtrl', 
		['$scope', function ($scope)
			{
				$scope.showTotal = false;
				
				// Define $scope.tusoks as array that'll store counts of fishball, squidball, chickenball clicks
				$scope.tusoks = [0,0,0];
				// Hopefully fully defined array that goes like: "$scope.tusoks = [{id:1, 'name':'chickenball'},..];"
				$scope.totalTusok = 0;
				
				// Create a counter to keep track of the additional tusoks
				$scope.tusokCounter = 0;
				// Will probably replace with just tusok.length
				
				// Displays array values changing and working on the console
			    $scope.$watch('tusoks', function (value) {
			        console.log(value);
			    }, true);
			    
			    $scope.addTusok = function(i)
			    {
					$scope.tusoks[i]++;
					$scope.totalTusok++;
			    	//to display as browser alert
					//use > alert("Total is "+ $scope.totalTusok);
				};
				
				//initialize arrays to store select options
				$scope.friedBallOptions = [
				    { name: 'Fishball', value: 'FSB' }, 
				    { name: 'Squidball', value: 'SQB' }, 
				    { name: 'Chikenball', value: 'CHB' },
				    { name: 'Kikiam', value: 'KKM' }, 
				    { name: 'Kwek2', value: 'KWK' },
				    { name: 'Teka nag-iipon ako', value: 'NBL' }
				    ];
				
				$scope.sauceOptions = [
				    { name: 'Manong\'s Special Sauce', value: 'MSS' }, 
				    { name: 'Maanghang na Suka', value: 'SMG' }, 
				    { name: 'Suka', value: 'SKA' },
				    { name: 'Wag! Kung sino2 nagsawsaw dyan..', value: 'NSC' }
				    ];
				
				$scope.palamigOptions = [
				    { name: 'Gulaman', value: 'GLM' }, 
				    { name: 'Buko Pandan', value: 'BPN' }, 
				    { name: 'Buko Juice', value: 'BKJ' },
				    { name: 'Pineapple Juice', value: 'PNJ' },
				    { name: 'Ay, ubos na barya ko', value: 'NJC' }
				    ];
		    
			}
		]
);

