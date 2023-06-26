this.onmessage =function(){
    var summ = 0;
    for(var i=0;i<10000000000;i++){
        summ+=i;
        //console.log(summ);
    }
    // alert(summ)
    this.postMessage(summ);
}
