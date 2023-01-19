echo "Welcome to Employee Wage Computation Problem"
isPartTime=1;
isFullTime=2;
totalSalary=0;
numWorkingDays=20;
empRatePerHr=20;
for(( day=1; day<=numWorkingDays; day++))
do
randomCheck=$((RANDOM%3));
case $randomCheck in $isFullTime)
                      empHrs=8
                      ;;
                     $isPartTime)
                      empHrs=4
                      ;;
                     *)
                      empHrs=0
                      ;;
esac 
salary=$(($empHrs*$empRatePerHr));
totalSalary=$(($totalSalary+$salary));
done
echo "Employee has earned $totalSalary$ in a month"
